package l8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class binarytree {
	Scanner scn = new Scanner(System.in);

	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public binarytree() {
		root = construct(null, false);
	}

	private Node construct(Node parent, boolean ilc) {
		// TODO Auto-generated method stub
		if (parent == null) {
			System.out.println("Enter the root node");
		} else {
			if (ilc) {
				System.out.println("enter the left child" + parent.data);
			} else {
				System.out.println("enter the left child" + parent.data);
			}
		}
		int item = scn.nextInt();
		Node nn = new Node();
		nn.data = item;

		System.out.println("left node");
		boolean hlc = scn.nextBoolean();
		if (hlc) {
			nn.left = construct(nn, true);
		}
		System.out.println("right node");
		boolean hrc = scn.nextBoolean();
		if (hrc) {
			nn.right = construct(nn, false);
		}

		return nn;
	}

	public void display() {
		System.out.println("-------------");
		display(root);
		System.out.println("-------------");
	}

	private void display(Node parent) {
		if (parent == null) {
			return;
		}
		String str = "";
		if (parent.left == null) {
			str += ".";
		} else {
			str += parent.left.data;
		}
		str += "->" + parent.data + "<-";
		if (parent.right == null) {
			str += ".";
		} else {
			str += parent.right.data;
		}
		System.out.println(str);
		display(parent.left);
		display(parent.right);
	}

	public int size() {
		return size(root);

	}

	private int size(Node node) {
		if (node == null) {
			return 0;
		}
		int ln = size(node.left);
		int rn = size(node.right);

		return ln + rn + 1;
	}

	public int max() {
		return max(root);
	}

	private int max(Node node) {
		if (node == null) {
			return Integer.MIN_VALUE;
		}
		int ln = max(node.left);
		int rn = max(node.right);
		return Math.max(node.data, Math.max(ln, rn));
	}

	public boolean find() {
		return find(root, 50);
	}

	private boolean find(Node node, int item) {
		if (node == null) {
			return false;
		}
		if (node.data == item) {
			return true;
		}
		boolean ln = find(node.left, item);
		boolean rn = find(node.right, item);
		return ln || rn;
	}

	public int ht() {
		return ht(root);

	}

	private int ht(Node node) {
		if (node == null) {
			return -1;
		}
		int ln = ht(node.left);
		int rn = ht(node.right);
		return Math.max(ln, rn) + 1;
	}

	private class HeapMover {
		int ans;
	}

	public int diameter1() {
		HeapMover mover = new HeapMover();
		diameter1(root, mover);
		return mover.ans;
	}

	private int diameter1(Node node, HeapMover mover) {

		if (node == null) {
			return -1;
		}

		int lh = diameter1(node.left, mover);
		int rh = diameter1(node.right, mover);

		int diameterPresentNode = lh + rh + 2;

		if (diameterPresentNode > mover.ans) {
			mover.ans = diameterPresentNode;
		}

		return Math.max(lh, rh) + 1;

	}

	public int diameter2() {
		return diameter2(root);
	}

	private int diameter2(Node node) {

		if (node == null) {
			return 0;
		}

		int ld = diameter2(node.left);
		int rd = diameter2(node.right);

		int sp = ht(node.left) + ht(node.right) + 2;

		int ans = Math.max(sp, Math.max(ld, rd));

		return ans;

	}

	private class diapair {
		int d = 0;
		int h = -1;
	}

	public int diameter3() {
		return diameter3(root).d;
	}

	private diapair diameter3(Node node) {

		if (node == null) {
			return new diapair();
		}

		diapair ldp = diameter3(node.left);
		diapair rdp = diameter3(node.right);
		diapair sdp = new diapair();
		int lh = ldp.h;
		int rh = rdp.h;
		int sp = lh + rh + 2;
		sdp.h = Math.max((ldp.h), (rdp.h)) + 1;
		sdp.d = Math.max(sp, Math.max((ldp.d), (rdp.d)));

		return sdp;

	}

	public boolean balfac() {
		return balfac(root);
	}

	private boolean balfac(Node node) {

		if (node == null) {
			return true;
		}

		boolean ld = balfac(node.left);
		boolean rd = balfac(node.right);

		int sp = ht(node.left) - ht(node.right);
		if (sp == 1 || sp == 0 || sp == -1 && ld && rd) {
			return true;
			// int ans = Math.max(sp, Math.max(ld, rd));
		} else {
			return false;
		}

	}

	private class balfacpair {
		boolean b = true;
		int h = -1;

	}

	public boolean balfac1() {
		return balfac1(root).b;
	}

	private balfacpair balfac1(Node node) {

		if (node == null) {
			return new balfacpair();
		}
		balfacpair sdp = new balfacpair();
		balfacpair blp = balfac1(node.left);
		balfacpair brp = balfac1(node.right);

		int sp = (blp.h) - (brp.h);
		if ((sp == 1 || sp == 0 || sp == -1) && blp.b && brp.b) {
			sdp.b = true;
		}
		sdp.h = Math.max(blp.h, brp.h);
		return sdp;
	}

	public boolean flipequivalent(binarytree other) {
		return flipequivalent(root, other.root);
	}

	private boolean flipequivalent(Node n1, Node n2) {
		if (n1 == null && n2 == null) {
			return true;
		}
		if (n1 == null || n2 == null) {
			return false;
		}
		if (n1.data != n2.data) {
			return false;
		}
		boolean ll = flipequivalent(n1.left, n2.left);
		boolean rr = flipequivalent(n1.right, n2.right);

		boolean lr = flipequivalent(n1.left, n2.right);
		boolean rl = flipequivalent(n1.right, n2.left);
		return (ll && rr) || (lr && rl);
	}

	public void preorder() {
		preorder(root);
	}

	private void preorder(Node node) {
		if (node == null) {
			return;
		}
		System.out.println(node.data);
		preorder(node.left);
		preorder(node.right);
	}

	public void postorder() {
		postorder(root);
	}

	private void postorder(Node node) {
		if (node == null) {
			return;
		}

		postorder(node.left);
		postorder(node.right);
		System.out.println(node.data);
	}

	public void inorder() {
		inorder(root);
	}

	private void inorder(Node node) {
		if (node == null) {
			return;
		}

		inorder(node.left);
		System.out.println(node.data);
		preorder(node.right);

	}

	private class preitr {
		Node n;
		boolean sd;
		boolean ld;
		boolean rd;
	}

	public void preitr() {
		Stack<preitr> Stack = new Stack();
		preitr sp = new preitr();
		sp.n = root;
		Stack.push(sp);

		while (!Stack.isEmpty()) {
			preitr tp = Stack.peek();
			if (tp.sd == false) {
				System.out.println(tp.n.data + "");
				tp.sd = true;
			}
//	Stack.pop();

			else if (tp.ld == false) {
				preitr np = new preitr();
				np.n = tp.n.left;
				if (np.n != null) {
					Stack.push(np);
				}
				tp.ld = true;
			} else if (tp.rd == false) {
				preitr np = new preitr();
				np.n = tp.n.right;
				if (np.n != null) {
					Stack.push(np);
				}
				tp.rd = true;
			} else {
				Stack.pop();
			}

		}

	}

	public int maxtree() {
		int[] maxsum = new int[1];
		maxtree(root, maxsum);
		return maxsum[0];
	}

	private int maxtree(Node node, int[] maxsum) {
		// int n=node.data;
		// int n1=node.data;
		if (node == null) {
			return 0;
		}
		int sum1 = maxtree(node.left, maxsum);
		int sum2 = maxtree(node.right, maxsum);
		int n = sum1 + sum2 + node.data;
		// n1+=sum2;
		if (n > maxsum[0]) {
			maxsum[0] = n;
		}

		return n;
	}

	private class maxsumpair {
		int entiresum = 0;
		int maxsum = Integer.MIN_VALUE;
	}

	public int maxpair() {
		return maxpair(root).maxsum;

	}

	private maxsumpair maxpair(Node node) {
		if (node == null) {
			return new maxsumpair();
		}
		maxsumpair sum = maxpair(node.left);
		maxsumpair sum1 = maxpair(node.right);
		maxsumpair ssp = new maxsumpair();
		ssp.entiresum = sum.entiresum + sum1.entiresum + node.data;
		ssp.maxsum = Math.max(ssp.entiresum, Math.max(sum.maxsum, sum1.maxsum));
		return ssp;
	}

	public binarytree(int[] pre, int[] in) {
		root = construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}

	private Node construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {
		if (ilo > ihi || plo > phi) {
			return null;
		}
		Node nn = new Node();
		nn.data = pre[plo];
		int si = -1;
		int nel = 0;
		for (int i = ilo; i <= ihi; i++) {
			if (in[i] == pre[plo]) {
				si = i;
			}
			nel++;

		}
		nn.left=construct(pre, plo + 1, plo + nel, in, ilo, si - 1);
		nn.right=construct(pre, plo + nel + 1, phi, in, si+ 1, ihi);
		return nn;

	}

	private class Bst {
		boolean isbst;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		Node largestBSTRootnode;
		int size;
	}

	public boolean istreebst() {
		System.out.println(istreebst(root).size);
		System.out.println(istreebst(root).largestBSTRootnode.data);
		return istreebst(root).isbst;
	}

	private Bst istreebst(Node node) {
		if (node == null) {
			return new Bst();
		}
		Bst lbp = istreebst(node.left);
		Bst rbp = istreebst(node.right);
		Bst sbp = new Bst();
		if (lbp.isbst && rbp.isbst && node.data > lbp.max && node.data < rbp.min) {
			sbp.isbst = true;
			sbp.largestBSTRootnode = node;
			sbp.min = lbp.size + rbp.size + 1;

		} else {

			sbp.isbst = false;
			if (lbp.size > rbp.size) {
				sbp.largestBSTRootnode = lbp.largestBSTRootnode;
				sbp.size=lbp.size;
			} else {
				sbp.largestBSTRootnode = rbp.largestBSTRootnode;
				sbp.size=rbp.size;
			}
		}
		sbp.max = Math.max(node.data, rbp.max);
		sbp.max = Math.max(node.data, lbp.max);
		return sbp;

	}
	public void binarytree1(int[] pos, int[] in) {
		root = construct1(pos, 0, pos.length - 1, in, 0, in.length - 1);
	}

	private Node construct1(int[] pos, int plo, int phi, int[] in, int ilo, int ihi) {
		if (ilo > ihi || plo > phi) {
			return null;
		}
		Node nn = new Node();
		nn.data = pos[phi];
		int si = -1;
		int nel = 0;
		for (int i = ilo; i <= ihi; i++) {
			if (in[i] == pos[plo]) {
				si = i;
			}
			nel++;

		}
	nn.left=	construct(pos, phi+nel-1 , phi-1, in, ilo, si - 1);
	nn.right=	construct(pos, phi + nel, phi-1, in, si+ 1, ihi);
		return nn;

	}
	private class VOPair implements Comparable<VOPair> {
		int val;
		int hlevel;
		int vlevel;

		public VOPair(int val, int hlevel, int vlevel) {
			this.val = val;
			this.hlevel = hlevel;
			this.vlevel = vlevel;
		}

		@Override
		public String toString() {
			return val + "";
		}

		@Override
		public int compareTo(VOPair o) {
			return this.hlevel - o.hlevel;
		}
	}

	public void verticalDisplay() {
		HashMap<Integer, ArrayList<VOPair>> map = new HashMap<>();

		verticalDisplay(root, map, 0, 0);

		// keys sort
		ArrayList<Integer> allkeys = new ArrayList<>(map.keySet());
		Collections.sort(allkeys);

		// loop on all keys
		for (int key : allkeys) {

			// array list sort
			ArrayList<VOPair> list = map.get(key);
			Collections.sort(list);

			System.out.println(key + " -> " + list);
		}

		System.out.println(map);

	}

	private void verticalDisplay(Node node, HashMap<Integer, ArrayList<VOPair>> map, int hl, int vl) {

		if (node == null) {
			return;
		}

		if (!map.containsKey(vl)) {
			map.put(vl, new ArrayList<>());
		}

		VOPair np = new VOPair(node.data, hl, vl);
		map.get(vl).add(np);

		verticalDisplay(node.left, map, hl + 1, vl - 1);
		verticalDisplay(node.right, map, hl + 1, vl + 1);

	}

}

