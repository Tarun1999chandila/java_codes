package l7;
import java.util.*;
public class nextsmallergre {

	

		public static void main(String args[]) throws Exception {
			// Your Code Here
			Scanner s = new Scanner(System.in);
			
			int t = s.nextInt();
			while(t-- > 0){
	    		
	    		int N=s.nextInt();
	    		int[] arr=new int[N];
	    		for(int i=0;i<N;i++){
	    			arr[i]=s.nextInt();
	    		}
	            
	            nextsmallergre obj = new nextsmallergre();
	            StacksUsingArrays stack =obj.new StacksUsingArrays();
	    		int[] ans=NextGreater(arr, stack);
	    		for(int i=0;i<ans.length;i++){
	    			System.out.print(ans[i]+" ");
	    		}
	    // 		System.out.println();
			}

		}

		public static int[] NextGreater(int[] arr,StacksUsingArrays stack) throws Exception {
	        //	public static int[] smgre(int[] arr) throws Exception {
		//	dynamicstack stack=new dynamicstack();
			int []nr11=new int[arr.length];
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
				while(!stack.isEmpty()&&arr[i]>arr[stack.top()]) {
					if(arr[i]>arr[j])
					nr11[stack.pop()]=arr[j];
				}
				}
				stack.push(i);
			}
				while(!stack.isEmpty()) {
					nr11[stack.pop()]=-1;
				
			}
				return nr11;
		}
	      //Write your code here
		
		private class StacksUsingArrays {
			private int[] data;
			private int tos;

			public static final int DEFAULT_CAPACITY = 10;

			public StacksUsingArrays() throws Exception {
				// TODO Auto-generated constructor stub
				this(DEFAULT_CAPACITY);
			}

			public StacksUsingArrays(int capacity) throws Exception {
				if (capacity <= 0) {
					System.out.println("Invalid Capacity");
				}
				this.data = new int[capacity];
				this.tos = -1;
			}

			public int size() {
				return this.tos + 1;
			}

			public boolean isEmpty() {
				if (this.size() == 0) {
					return true;
				} else {
					return false;
				}
			}

			public void push(int item) throws Exception {
				if (this.size() == this.data.length) {
					throw new Exception("Stack is Full");
				}
				this.tos++;
				this.data[this.tos] = item;
			}

			public int pop() throws Exception {
				if (this.size() == 0) {
					throw new Exception("Stack is Empty");
				}
				int retVal = this.data[this.tos];
				this.data[this.tos] = 0;
				this.tos--;
				return retVal;
			}

			public int top() throws Exception {
				if (this.size() == 0) {
					throw new Exception("Stack is Empty");
				}
				int retVal = this.data[this.tos];
				return retVal;
			}

			public void display() throws Exception {
				if (this.size() == 0) {
					throw new Exception("Stack is Empty");
				}
				for (int i = this.tos; i >= 0; i--) {
					System.out.println(this.data[i]);
				}

			}

		}

	}



