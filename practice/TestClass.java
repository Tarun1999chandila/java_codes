package practice;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) {
		    Scanner in = new Scanner(System.in);

		    int n = in.nextInt();
		    int array[] = new int[n];
		    for (int i = 0; i < n; i++) {
		      array[i] = in.nextInt();
		    }

		    ISegTree<Integer> evenOddSegTree = new EvenOddSegTree(array);
		    int q = in.nextInt();
		    while (q-- > 0) {
		      int t = in.nextInt();
		      int f = in.nextInt();
		      int s = in.nextInt();
		      if (t == 0) {
			evenOddSegTree.update(f - 1, s);
		      } else if (t == 1) {
			System.out.println(s - f + 1 - evenOddSegTree.query(f - 1, s - 1));
		      } else if (t == 2) {
			System.out.println(evenOddSegTree.query(f - 1, s - 1));
		      }
		    }

		    in.close();
		  }

		  private interface ISegTree<T> {
		    void update(int leafIndex, T data);

		    T query(int left, int right);
		  }

		  private static class EvenOddSegTree implements ISegTree<Integer> {

		    private int[] fullTree;
		    private int[] array;
		    private int size;

		    EvenOddSegTree(int[] array) {
		      this.array = array;
		      this.size = array.length;
		      int x = (int) (Math.ceil(Math.log(size) / Math.log(2)));
		      int initSize = 2 * (int) Math.pow(2, x) - 1;
		      ;
		      this.fullTree = new int[initSize];
		      build(0, 0, size - 1);
		    }

		    private int build(int index, int left, int right) {
		      if (left == right) {
			fullTree[index] = array[left] % 2;
		      } else {
			int mid = left + (right - left) / 2;
			int leftCount = build(index * 2 + 1, left, mid);
			int rightCount = build(index * 2 + 2, mid + 1, right);
			fullTree[index] = leftCount + rightCount;
		      }
		      return fullTree[index];
		    }

		    private void update(int index, int left, int right, int leafIndex, int val) {
		      fullTree[index] += val;
		      if (left != right) {
			int mid = left + (right - left) / 2;
			if (leafIndex <= mid) {
			  update(index * 2 + 1, left, mid, leafIndex, val);
			} else {
			  update(index * 2 + 2, mid + 1, right, leafIndex, val);
			}
		      }
		    }

		    @Override
		    public void update(int leafIndex, Integer data) {
		      int diff = (data % 2) - (array[leafIndex] % 2);
		      array[leafIndex] = data;
		      if (diff != 0) {
			update(0, 0, size - 1, leafIndex, diff);
		      }
		    }

		    private int query(int index, int qLeft, int qRight, int left, int right) {
		      if (left <= qLeft && qRight <= right) {
			return fullTree[index];
		      }

		      if (left > qRight || right < qLeft) {
			return 0;
		      }

		      int mid = qLeft + (qRight - qLeft) / 2;
		      return query(index * 2 + 1, qLeft, mid, left, right)
			  + query(index * 2 + 2, mid + 1, qRight, left, right);

		    }

		    @Override
		    public Integer query(int left, int right) {
		      return query(0, 0, size - 1, left, right);
		    }
		  }
}
