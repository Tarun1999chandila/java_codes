package l7;

import java.util.Scanner;

//import l8.dynamicstack;
//import l8.oops;

public class nextsmaller {
	

		public static void main(String args[]) throws Exception {
			// Your Code Here
			Scanner s = new Scanner(System.in);
		
				//dynamicstack ds = new dynamicstack();
			int t = s.nextInt();
			while(t-- > 0){
	    		
	    		int N=s.nextInt();
	    		int[] arr=new int[N];
	    		for(int i=0;i<N;i++){
	    			arr[i]=s.nextInt();
	    		}
	            
	          nextsmaller obj = new nextsmaller();
	         dynamicstack stack = obj.new dynamicstack();
	    		int[] ans=smgre(arr, stack);
	    		for(int i=0;i<ans.length;i++){
	    			System.out.print(ans[i]+" ");
	    		}
	    // 		System.out.println();
			}

		} class dynamicstack extends oops {

			@Override
				public  void push(int item) throws Exception{
					if( isfull()) {
			int[] na=new int[2*data.length];
			for(int i=0;i<data.length;i++) {
				na[i]=data[i];
			}
			data=na;
			}
			
			super.push(item);
			}
		}

		public static int[] smgre(int[] arr,	dynamicstack stack) throws Exception {
			//dynamicstack stack=new dynamicstack();
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


}
