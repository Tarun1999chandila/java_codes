package l8;

public class linkedlist {
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

	public void RDI() throws Exception {

		int left = 0;
		int right = size - 1;
		// int idx=0;
//	for(int i=0;i<;i++ ) {
		while (left <= right) {
			node ln = getnodeat(left);
			node rn = getnodeat(right);
			int temp = ln.data;
			ln.data = rn.data;
			rn.data = temp;

			left++;
			right--;
		}
	}

	public void RPI() {
		node prev = null;
		node curr = head;
		while (curr != null) {
			node ahead = curr.next;
			curr.next = prev;
			prev = curr;
			curr = ahead;
		}
		node temp = head;
		head = tail;
		tail = temp;

	}

	public void RPR() {
		RPR(null, head);
		node temp = head;
		head = tail;
		tail = temp;
	}

	private void RPR(node prev, node curr) {
		if (curr == null) {
			return;
		}
		RPR(curr, curr.next);
		curr.next = prev;
	}

	public void RDR() {
		// RDR(head,head,0);
		Heapmover mover = new Heapmover();
		mover.left = head;
		RDRheap(mover, head, 0);
	}

	private node RDR(node left, node right, int count) {
		if (right == null) {
			return left;
		}
		node cl = RDR(left, right.next, count + 1);
		if (count >= size / 2) {
			int temp = cl.data;
			cl.data = right.data;
			right.data = temp;
		}
		return cl.next;
	}

	private class Heapmover {

		node left;
	}

	private void RDRheap(Heapmover mover, node right, int count) {
		if (right == null) {
			return;
		}
		RDRheap(mover, right.next, count + 1);
		if (count >= size / 2) {
			int temp = mover.left.data;
			mover.left.data = right.data;
			right.data = temp;
		}
		mover.left = mover.left.next;
	}

	public void fold() {
		fold(head, head, 0);

	}

	private node fold(node left, node right, int count) {
		if (right == null) {
			return left;
		}
		left = fold(left, right.next, count + 1);
		if (count > size / 2) {
			node ahead = left.next;
			left.next = right;
			right.next = ahead;
			return ahead;
		}
		if (count == size / 2) {
			tail = right;
			right.next = null;
		}
		return null;

	}

	public int mid() {
		node slow = head;
		node fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
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

	// public void intersection() {
	public int linkedListIntersection() {

		node a1 = new node(10);

		node a2 = new node(20);

		node a3 = new node(30);

		node a4 = new node(40);

		node a5 = new node(50);

		node a6 = new node(60);

		node b1 = new node(70);

		node b2 = new node(80);

		node b3 = new node(90);

		node b4 = new node(100);

		node b5 = new node(110);

		node b6 = new node(120);

		a1.next = a2;

		a2.next = a3;

		a3.next = a4;

		a4.next = a5;

		a5.next = a6;

		b1.next = b2;

		b2.next = b3;

		b3.next = b4;

		b4.next = b5;

		b5.next = b6;

		b6.next = a3;

		// logic ....
		node fp = a1;
		node sp = b1;
		while (fp != sp) {
			if (fp == null) {
				fp = b1.next;
			} else {
				fp = fp.next;
			}
			if (sp == null) {
				sp = a1.next;
			} else {
				sp = sp.next;

			}
		}
		return fp.data;
	}

	public void createDummyList() {
		node a1 = new node(10);
		node a2 = new node(20);
		node a3 = new node(30);
		node a4 = new node(40);
		node a5 = new node(50);
		node a6 = new node(60);
		node a7 = new node(70);
		node a8 = new node(80);
		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
		a5.next = a6;
		a6.next = a7;
		a7.next = a8;
		a8.next = a3;
		head = a1;
	}

	public boolean detectloop() {
		node slow = head;
		node fast = head;
		// int count=1;
		// int temp=slow.next()
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				break;
			}
		}
		if (fast == slow) {
			return true;
		} else
			return false;
	}

	public boolean detectremoveloop() {
		node slow = head;
		node fast = head;
		// int count=1;
		// int temp=slow.next()
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				break;
			}
		}

		if (fast == slow) {
//		int count=1;
//		node temp=slow.next;
//		while(temp!=slow) {
//			count++;
//		}'
			node start = head;
			while (slow.next != start.next) {
				slow = slow.next;
				start = start.next;
			}
			slow.next = null;
			return true;
		} else
			return false;

	}
//			node first=head;
//			node loop=slow;
//			while(first!=loop) {
//				first=first.next;
//				loop=loop.next;
//				slow.next=null;
//			}

		public void kreverse(int k) throws Exception {
			
				linkedlist prev=null;
				while(size!=0) {
				linkedlist curr=new linkedlist();
				for(int i=0;i<k&&size!=0;i++) {
				curr.addfirst(this.removeFirst());
				}
				if(prev==null) {
					prev=curr;
					
				}
				else {
					prev.tail.next=curr.head;
					prev.tail=curr.tail;
					prev.size+=curr.size;
				}
					
				}
				head=prev.head;
				tail=prev.tail;
				size=prev.size;
			}
		
}
