package l8;

public class queue {
protected int[] data;
	protected int front;
protected int size;

public queue() {
	data=new int[5];
	front=size=0;
}
public queue(int cap) {
	data=new int[cap];
	front=size=0;
}
public void enqueue(int item) throws Exception {
	if(isfull()) {
		
		throw new Exception("overflow");
	}
	int idx=(front+size)%data.length;
	data[idx]=item;
	size++;
}
public int dequeue() throws Exception {
	if(isempty()) {
		throw new Exception("empty");
	}
	int temp=data[front];
	data[front]=0;
	front=(front+1)%data.length;
	size--;
	return temp;
}
public int  getfront() throws Exception {
	if(isempty()) {
		throw new Exception("empty");
	}
	return data[front];
}
public int size() {
	return size;
}
public boolean isfull() {
	return size==data.length;
}
public boolean isempty() {
	return size()==0 ;
}
public void display() {

	for(int i=0;i<data.length;i++) {
		int idx=(front+i)%data.length;
		System.out.println(data[idx]);
	}
}
}


