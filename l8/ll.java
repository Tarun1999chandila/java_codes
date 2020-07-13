package l8;

import java.util.*;

public class ll {
	private class node {
		public node(int i) {
			// TODO Auto-generated constructor stub
			this.data = i;
		}

		public node() {
			// TODO Auto-generated constructor stub
		}

		int data;
		node next;
	}

	private node head;
	private node tail;
	private int size;

	public boolean isEmpty() {
		return size == 0;
	}

	public int getfirst() throws Exception {
		if (size == 0) {
			throw new Exception("LL is empty");
		}
		return head.data;
	}

	public int getlast() throws Exception {
		if (size == 0) {
			throw new Exception("LL is empty");
		}
		return tail.data;
	}

	public int getat(int idx) throws Exception {
		if (size == 0) {
			throw new Exception("LL is empty");
		}
		if (idx < 0 || idx >= size) {
			throw new Exception("invalid index");
		}
		node temp = head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	public node getnodeat(int idx) throws Exception {
		if (size == 0) {
			throw new Exception("LL is empty");
		}
		if (idx < 0 || idx >= size) {
			throw new Exception("invalid index");
		}
		node temp = head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void display() {

		System.out.println("---------------------");

		node temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

		System.out.println(".");
		System.out.println("---------------------");

	}

	public void addlast(int item) {
		node nn = new node();
		nn.data = item;
		if (size > 0) {
			tail.next = nn;
		}
		if (size == 0) {
			head = tail = nn;
			this.size++;
		} else {
			tail = nn;
			size++;

		}
	}

	public void addfirst(int item) {
		node nn = new node();
		nn.data = item;
		if (size > 0) {
			nn.next = head;
		} else if (size == 0) {
			head = tail = nn;
			size++;
		} else {
			head = nn;
			size++;

		}
	}

	public void addAt(int item, int idx) throws Exception {
		if (size == 0) {

			throw new Exception("ll is empty");

		}
		if (idx < 0 || idx >= size) {
			throw new Exception("invalid index");
		}
		if (idx == 0) {
			addfirst(item);
			return;
		} else if (idx == size) {
			addlast(item);
			return;
		}

// create a new node
		node nn = new node();
		nn.data = item;
		nn.next = null;

// links set
		node nm1 = getnodeat(idx - 1);
		node np1 = nm1.next;

		nm1.next = nn;
		nn.next = np1;

// data members
		size++;

	}

	public int removeFirst() throws Exception {

		if (size == 0) {
			throw new Exception("LL is Empty.");
		}

		int temp = head.data;

		if (size == 1) {
			head = tail = null;
			size--;
		} else {
			head = head.next;
			size--;
		}

		return temp;

	}

	public int removeLast() throws Exception {

		if (size == 0) {
			throw new Exception("LL is Empty.");
		}

		int temp = tail.data;

		if (size == 1) {
			head = tail = null;
			size--;
		} else {
			tail = getnodeat(size - 2);
			tail.next = null;
			size--;
		}

		return temp;

	}

	public int removeAt(int idx) throws Exception {

		if (size == 0) {
			throw new Exception("LL is Empty.");
		}

		if (idx < 0 || idx >= size) {
			throw new Exception("Invalid Index.");
		}

		if (idx == 0) {
			return removeFirst();
		} else if (idx == size - 1) {
			return removeLast();
		} else {

			node nm1 = getnodeat(idx - 1);
			node n = nm1.next;
			node np1 = n.next;

			nm1.next = np1;
			size--;

			return n.data;

		}
	}

	public int kthfromlast(int k) {
		node slow = head;
		node fast = head;
		for (int i = 0; i < k; i++) {
			fast = fast.next;

		}
		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		return slow.data;
	}
	


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ll list = new ll();
Scanner scn=new Scanner(System.in);
 int n=0;
while(n!=-1){
	 n=scn.nextInt();
     list.addlast(n);
}
int m=scn.nextInt();
System.out.println(list.kthfromlast(m));
}
}