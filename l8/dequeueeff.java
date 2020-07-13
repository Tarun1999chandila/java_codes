package l8;

public class dequeueeff {
	static dynamicstack prims = new dynamicstack();

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		prims.push(10);
		prims.push(20);
		prims.push(30);
		prims.push(30);
		prims.push(40);
		prims.display();
		//System.out.println(prims.dequeue());
	}

	public static void enqueue(int item, dynamicstack helper) throws Exception {
		try {
			while (prims.size() != 0) {
				int temp = prims.pop();
				helper.push(temp);
			}
			// enqueue(item,helper);
			prims.push(item);
			while (helper.size() != 0) {

				prims.push(helper.pop());

				// enqueue(item,helper);
				// System.out.println(temp);
			}
		} catch (Exception e) {
			throw new Exception("queue is full");
		}

	}

	public static int dequeue() throws Exception {
		try {
			return prims.pop();
		} catch (Exception e) {
			throw new Exception("queue is empty");
		}
	}

	public static int getfront() throws Exception {
		try {
			return prims.peek();

		} catch (Exception e) {
			throw new Exception("queue is empty");
		}
	}
}
