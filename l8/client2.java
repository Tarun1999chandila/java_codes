package l8;

public class client2  {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		dynamicqueue dq = new dynamicqueue();
		dq.enqueue(10);
		dq.enqueue(20);
		dq.enqueue(30);
		dq.enqueue(40);
		dq.enqueue(50);
		dq.enqueue(60);
		dq.enqueue(70);
		dq.display();
		System.out.println("---------");
		dq.display();
		actualreverse(dq);
		System.out.println("---------");
		dq.display();
		reverse(dq,0);
	}
	public static void actualreverse(dynamicqueue queue) throws Exception {
		if(queue.isempty()) {
		return;
		}
		int temp=queue.dequeue();
		actualreverse(queue);
		System.out.println(temp);
		queue.enqueue(temp);
		
		
	}
	public static void reverse(dynamicqueue queue,int count) throws Exception {
		if(count==queue.size()) {
			return;
		}
		int temp=queue.dequeue();
		queue.enqueue(temp);
		reverse(queue,count+1);
		System.out.println(temp);
	}
	

}
