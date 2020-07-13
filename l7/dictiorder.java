package l7;

import java.util.Scanner;

public class dictiorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
//String s1=scn.next();
		//dorder(s1,"",s1);
int n=scn.nextInt();
int []arr=new int[n];
int halfsum=0;
for(int i=0;i<arr.length;i++) {
	arr[i]=scn.nextInt();
	halfsum+=arr[i];
}
halfsum/=2;
//int n1=scn.nextInt();
//int c=(split(arr,halfsum,0,0,"",0,""));
//System.out.println(c);

	}
	public static void dorder(String ques,String ans,String org) {
		if(ques.length()==0) {
			if(org.compareTo(ans)<0) {
			System.out.println(ans);
			}
			return;
		}
		for(int i=0;i<ques.length();i++) {
		char ch=ques.charAt(i);
		String rq=ques.substring(0,i)+ques.substring(i+1);
		dorder(rq,ans+ch,org);
	}
		

}
//	
	    public static int split(int [] arr,int finals,int vidx,int sum1,String ans1,int sum2,String ans2){
	    	
	    	if(vidx==arr.length) {
	    	if(sum1==sum2) {
	    		System.out.println(ans1+ " and " + ans2);
	    		return 1;
	    	}
	    		
	    		
	    }
	    	
	    	int count=0;
	    	if(sum1+arr[vidx]<=finals) {
	    		//if(arr[vidx]<=finals) {
	    		count+= split(arr,finals,vidx+1,sum1+arr[vidx],ans1+arr[vidx]+" ",sum2,ans2 );}
	    	
	    	if(sum2+arr[vidx]<=finals) {
      count+= split(arr,finals,vidx+1,sum1,ans1,sum2+arr[vidx],ans2+arr[vidx]+" ");
	    	}
	   return count;
	    }
	    
	}


