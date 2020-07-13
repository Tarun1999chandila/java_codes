package heap;

import java.util.ArrayList;

import l7.car;

public class heapgenericclient {

	public static void main(String[] args) {
		heapgenerics<car> heap=new heapgenerics<>();
		car[] carr=new car[4];
		carr[0]= new car(100,"black",500000);
		carr[1]= new car(200,"blue",200000);
		carr[2]= new car(150,"white",600000);
		carr[3]= new car(80,"red",700000);
		for(int i=0;i<carr.length;i++) {
			heap.add(carr[i]);
		}
		while(!heap.isEmpty()) {
			System.out.println(heap.remove());
		}
		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

		lists.add(new ArrayList<>());

		lists.add(new ArrayList<>());

		lists.add(new ArrayList<>());

		lists.add(new ArrayList<>());

		lists.get(0).add(1);

		lists.get(0).add(8);

		lists.get(0).add(9);

		lists.get(0).add(10);

		lists.get(0).add(12);

		lists.get(1).add(5);

		lists.get(1).add(15);

		lists.get(1).add(20);

		lists.get(2).add(7);

		lists.get(2).add(13);

		lists.get(2).add(25);

		lists.get(2).add(30);

		lists.get(3).add(2);

		lists.get(3).add(3);
		int[] arr= {20,50,30,40,5,4,45};
		kLargestElements(arr,3);
	}

	public static class Pair implements Comparable<Pair> {
		int data;
		int listNo;
		int idxNo;

		@Override
		public int compareTo(Pair o) {
			return o.data - this.data;
		}

	}
	public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists) {

		ArrayList<Integer> ans = new ArrayList<>();

		heapgenerics<Pair> heap = new heapgenerics<>();

		for (int i = 0; i < lists.size(); i++) {
			Pair np = new Pair();
			np.data = lists.get(i).get(0);
			np.idxNo = 0;
			np.listNo = i;

			heap.add(np);
		}

		while (!heap.isEmpty()) {

			Pair rp = heap.remove();

			ans.add(rp.data);

			rp.idxNo++;

			if (rp.idxNo < lists.get(rp.listNo).size()) {
				rp.data = lists.get(rp.listNo).get(rp.idxNo);
				heap.add(rp);
			}
		}

		return ans;
		}


	public static void kLargestElements(int[] arr, int k) {

		heapdemo heap = new heapdemo();

		for (int i = 0; i < k; i++) {
			heap.add(arr[i]);
		}

		for (int i = k; i < arr.length; i++) {
			int weaker = heap.get();

			if (arr[i] > weaker) {
				heap.remove();
				heap.add(arr[i]);
			}

		}

		while (!heap.isEmpty()) {
			System.out.println(heap.remove());
		}
	}

	

}
