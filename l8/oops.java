package l8;

public class oops {

 protected int [] data;
 protected int tos;
 public oops() {
	 data=new int[5];
	 tos=-1;
 }
 public oops(int cap) {
	 data=new int [cap];
	 tos=-1;
	 
 }
public void push(int item) throws Exception  {
	if(isfull()) {
		throw new Exception("is full");
	}
	tos++;
	data[tos]=item;
}
public int pop() throws Exception  {
	if(isempty()) {
		throw new Exception("is empty");
	}
	int t=data[tos];
	data[tos]=0;
	tos--;
	return t;
}
public int peek() throws Exception {
	if(isempty()) {
		throw new Exception("is empty");
	}
	int t=data[tos];
	return t;
}
public int size() {
	return tos+1;
}
public boolean isempty() {
	return size()==0;
}
public boolean isfull() {
	return size()==data.length;
}
public void display() {
	for(int i=tos;i>=0;i--) {
		System.out.println(data[i]);
	}
}
public int reverse() {
	return data[tos];
}


	

}
