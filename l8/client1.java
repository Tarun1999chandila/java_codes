package l8;

public class client1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		dynamicstack ds = new dynamicstack();
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

		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.push(60);
		ds.push(70);
		ds.push(80);
		ds.display();
		System.out.println("---------");
		displayreverse(ds);
		System.out.println("---------");
		actualreverse(ds, new dynamicstack());
		System.out.println("------------");

		System.out.println("____NGE____");
		int[] arr = { 50, 40, 30, 45, 15, 10, 60, 55 };
		nextgreater(arr);
		System.out.println("____NGE2____");
		// int[] arr= {50,40,30,45,15,10,60,55};
		// System.out.println;
		int[] ans1 = nextgreater2(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "->" + ans1[i]);
		}
		int[] stocks = { 50, 30, 10, 35, 70, 20, 5, 25, 30, 3 };

		int[] span = stockSpan(stocks);

		for (int val : span) {
			System.out.println(val);
		}
		System.out.println("-------------------------------------");
reverse1(ds);
actualreverse1(ds,new dynamicstack());
System.out.println("--------------");
int[] arr1= {50,40,30,45,10,15,60,55};
int [] nr1=nxtgre(arr);
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]+"->"+nr1[i]);
}
System.out.println("----------------------------");
int[] arr11= {50,40,30,45,10,15,60,55};
int []nr=nextgre2(arr11);
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]+"->"+nr[i]);
}
System.out.println("---------------------------------------");
int[] arr2= {5,1,9,2,5,1,7};
int []nr11=smgre(arr2);
for(int i=0;i<arr2.length;i++) {
	System.out.println(arr2[i]+"->"+nr11[i]);
}
//ds.reverse();
	}

	public static void displayreverse(dynamicstack stack) throws Exception {
		if (stack.isempty()) {
			return;
		}
		int temp = stack.pop();
		displayreverse(stack);
		System.out.println(temp);
		stack.push(temp);
	}

	public static void actualreverse(dynamicstack stack, dynamicstack helper) throws Exception {
		if (stack.isempty()) {
			actualreverse2(stack, helper);
			return;
		}
		int temp = stack.pop();
		helper.push(temp);
		actualreverse(stack, helper);
		// System.out.println(temp);

	}

	public static void actualreverse2(dynamicstack stack, dynamicstack helper) throws Exception {
		if (helper.isempty()) {

			return;
		}
		int temp = helper.pop();
		stack.push(temp);
		actualreverse2(stack, helper);
		System.out.println(temp);

	}

	public static void nextgreater(int[] arr) throws Exception {
		dynamicstack stack = new dynamicstack();
		for (int i = 0; i < arr.length; i++) {
			
			while (!stack.isempty() && stack.peek() < arr[i]) {
			
				System.out.println(stack.pop() + "-> " + arr[i]);
			
			}
			stack.push(arr[i]);
		}
		
		while (!stack.isempty()) {
			System.out.println(stack.pop() + "-> -1");
		}
	}

	public static int[] nextgreater2(int[] arr) throws Exception {
		int[] ans1 = new int[arr.length];
		// arr[0]=1;
		dynamicstack stack = new dynamicstack();
		for (int i = 0; i < arr.length; i++) {
			while (!stack.isempty() && arr[stack.peek()] < arr[i]) {
				ans1[stack.pop()] = arr[i];
			}
			stack.push(i);
		}
		while (!stack.isempty()) {
			ans1[stack.pop()] = -1;
		}
		return ans1;
	}

	public static int[] stockSpan(int[] arr) throws Exception {

		dynamicstack stack = new dynamicstack();

		int[] ans = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			while (!stack.isempty() && arr[i] > arr[stack.peek()]) {
				stack.pop();
			}

			if (stack.isempty()) {
				ans[i] = i + 1;
			} else {
				ans[i] = i - stack.peek();
			}

			stack.push(i);

		}

		return ans;
	}
	public static void reverse1(dynamicstack stack) throws Exception {
	if(stack.isempty()) {
		return;
	}
		int temp=stack.pop();
	reverse1(stack);
	System.out.println(temp);
	stack.push(temp);
	}
	public static void actualreverse1(dynamicstack stack,dynamicstack helper) throws Exception {
		if(stack.isempty()) {
			actualreverse3(stack,helper);
			return;
		}
		int temp=stack.pop();
		helper.push(temp);
		actualreverse1(stack,helper);
		
	}
	public static void actualreverse3(dynamicstack stack,dynamicstack helper) throws Exception {
		if(helper.isempty()) {
			return;
		}
		int temp=helper.pop();
		
		stack.push(temp);
		actualreverse3(stack,helper);
		System.out.println(temp);
	}
	public static void nextgre(int [] arr) throws Exception {
		dynamicstack ds=new dynamicstack();
		for(int i=0;i<arr.length;i++) {
			while(!ds.isempty()&&ds.peek()<arr[i]) {
				System.out.println(ds.pop()+"->"+arr[i]);
			}
			ds.push(arr[i]);
		}
		while(!ds.isempty()) {
			System.out.print(ds.pop()+ "-> -1");
		
			
		}
	}
	public static int[] nextgre2(int [] arr) throws Exception {
		dynamicstack ds=new dynamicstack();
		int[] nr=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			while(!ds.isempty()&&arr[ds.peek()]<arr[i]) {
				nr[(ds.pop())]=arr[i];
			}
			ds.push(i);
		}
		while(!ds.isempty()) {
			nr[ds.pop()]= -1;
		
			
		}
		return nr;
	}
	public static int[] stokpan1(int[] arr) throws Exception {
		dynamicstack dq=new dynamicstack();
		int[] nr=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			while(!dq.isempty()&&arr[i]>arr[dq.peek()]) {
				dq.pop();
				
			}
			if(dq.isempty()) {
				nr[i]=i+1;
			}
			else {
				nr[i]=i-dq.peek();
			}
			dq.push(i);
		}
		return nr;
	}
public static int[] nxtgre(int [] arr) throws Exception {
	dynamicstack dq=new dynamicstack();
	int []nr=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		while(!dq.isempty()&&arr[i]>nr[dq.peek()]) {
			nr[dq.pop()]=arr[i];
		}
		dq.push(i);
	}
		while(!dq.isempty()) {
			nr[dq.pop()]=-1;
		
		
	}
	return nr;
}
	public static int[] stkpn(int[]arr) throws Exception {
		dynamicstack stack=new dynamicstack();
		int [] nr=new int[arr.length-1];
		for(int i=0;i<arr.length;i++) {
			while(!stack.isempty()&&arr[i]>nr[stack.peek()]) {
				nr[stack.pop()]=arr[i];
			}
			if(stack.isempty()) {
				nr[i]=i+1;
			}
			else {
				nr[i]=i-stack.peek();
			}
		}
		return nr;
	}
	public static int[] smgre(int[] arr) throws Exception {
		dynamicstack stack=new dynamicstack();
		int []nr11=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			while(!stack.isempty()&&arr[i]>arr[stack.peek()]) {
				if(arr[i]>arr[j])
				nr11[stack.pop()]=arr[j];
			}
			}
			stack.push(i);
		}
			while(!stack.isempty()) {
				nr11[stack.pop()]=-1;
			
		}
			return nr11;
	}
}