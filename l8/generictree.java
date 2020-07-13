package l8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class generictree {

	Scanner scn = new Scanner(System.in);

	private class Node {
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}

	private Node root;

	public generictree() {
		root = construct(null, -1);
	}

	private Node construct(Node parent, int ith) {

		if (parent == null) {
			System.out.println("Enter the data for root node ?");
		} else {
			System.out.println("Enter the data for " + ith + " child of " + parent.data + " ?");
		}

		int item = scn.nextInt();

		Node nn = new Node();
		nn.data = item;

		System.out.println("No. of children for " + nn.data + " ?");
		int noc = scn.nextInt();

		for (int i = 0; i < noc; i++) {
			Node child = construct(nn, i);
			nn.children.add(child);
		}

		return nn;

	}

	public void display() {
		System.out.println("---------------------");
		display(root);
		System.out.println("---------------------");
	}

	private void display(Node node) {

		String str = node.data + " -> ";

		for (Node child : node.children) {
			str += child.data + ", ";
		}

		str += ".";
		System.out.println(str);

		for (Node child : node.children) {
			display(child);
		}

	}

	public int size() {
		return size(root);
	}

	private int size(Node node) {
		int ts = 0;
		for (Node child : node.children) {
			int cs = size(child);
			ts += cs;
		}
		return ts + 1;
	}

	public int max() {
		return max(root);
	}

	private int max(Node node) {
		int max = node.data;
		for (Node child : node.children) {
			int tf = max(child);
			// int cs=Integer.MIN_VALUE;
			if (tf > max) {
				max = tf;
			}

		}
		return max;

	}

	public boolean find() {
		return find(50, root);
	}

	private boolean find(int item, Node node) {
		if (item == node.data) {
			return true;
		}
		for (Node child : node.children) {
			boolean cf = find(item, child);
			if (cf) {
				return true;
			}
		}
		return false;
	}

	public int height() {
		return height(root);
	}

	private int height(Node node) {
		int th = -1;
		for (Node child : node.children) {
			int nh = height(child);
			if (nh > th) {
				th = nh;
			}
		}
		return th + 1;
	}

	public void mirror() {
		mirror(root);
	}

	private void mirror(Node node) {

		for (Node child : node.children) {
			mirror(child);

		}
		int l = 0;
		int r = node.children.size() - 1;
		while (l < r) {
			Node ln = node.children.get(l);
			Node rn = node.children.get(r);
			ln = node.children.set(l, rn);
			rn = node.children.set(r, ln);
			l++;
			r--;
		}

	}

	public void printatlevel(int level) {
		printatlevel(root, level, 0);
	}

	private void printatlevel(Node node, int level, int count) {
		if (level == count) {
			System.out.println(node.data);
			return;
		}
		for (Node child : node.children) {
			printatlevel(child, level, count + 1);
		}

	}

	public void linearize() {
		linearize(root);
	}

	private void linearize(Node node) {
		for (Node child : node.children) {
			linearize(child);
		}
		if (node.children.size() > 1) {
			Node temp = node.children.remove(1);
			Node tail = gettail(node.children.get(0));
			tail.children.add(temp);
		}
	}

	private Node gettail(Node node) {
		if (node.children.size() == 0) {
			return node;
		}
		return gettail(node.children.get(0));
	}

	public void preorder() {                      
	}

	private void preorder(Node node) {
		System.out.println(node.data);
		for (Node child : node.children) {
			preorder(child);
		}
	}

	public void levelOrder() {

		LinkedList<Node> queue = new LinkedList<>();

		queue.addLast(root);

		while (!queue.isEmpty()) {

			Node rn = queue.removeFirst();

			System.out.print(rn.data + " ");

			for (Node child : rn.children) {
				queue.addLast(child);
			}

		}
		
		System.out.println();

	}
	public void levelorderlw() {
		LinkedList<Node> queue = new LinkedList<>();

		queue.addLast(root);
		queue.addLast(null);

		while (!queue.isEmpty()) {

			Node rn = queue.removeFirst();
			if(rn==null) {
				System.out.println();
				if(queue.isEmpty()) {
					break;
				}
				queue.addLast(null);
				continue;
				
			}

			System.out.print(rn.data + " ");

			for (Node child : rn.children) {
				queue.addLast(child);
			}

		}
		
		System.out.println();
		     
	}
public void levelorderlw2() {
	LinkedList<Node> queue = new LinkedList<>();
	LinkedList<Node> helper = new LinkedList<>();

	queue.addLast(root);
	//queue.addLast(null);

	while (!queue.isEmpty()) {

		Node rn = queue.removeFirst();
	

		System.out.print(rn.data + " ");

		for (Node child : rn.children) {
			helper.addLast(child);
		}
		if(queue.isEmpty()) {
			queue=helper;
			helper=new LinkedList<>();
		System.out.println();	
		}

	}
	
	
		
	}
public void levelorderzz() {
	LinkedList<Node> primarys = new LinkedList<>();
	LinkedList<Node> helpers = new LinkedList<>();
int count=0;
	primarys.addFirst(root);
	//queue.addLast(null);

	while (!primarys.isEmpty()) {

		Node rn = primarys.removeFirst();
	

		System.out.print(rn.data + " ");
if(count%2==0) {
		for (Node child : rn.children) {
			helpers.addFirst(child);
		}
}
		else {
			for(int i=rn.children.size()-1;i>=0;i--) {
				helpers.addFirst(rn.children.get(i));
				
			}
		}
		
		if(primarys.isEmpty()) {
			count++;
			primarys=helpers;
			helpers=new LinkedList<>();
		System.out.println();	
		}
	}

	}
	
	
		  
	}




