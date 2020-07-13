package l5;


	import java.util.*;

	 class series {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner scn=new Scanner(System.in);
	int N1=scn.nextInt();
	int N2=scn.nextInt();
	//int n=1;
	int ans=0;
	for(int n=1;N1>0;n++){
	                       // tera for loop kya krta h  for(int n=0;n<n1 <n++)
	ans=(3*n)+2;
	if((ans%N2)!=0){
		System.out.println(ans);
		N1--;
	}

	}
		}
	 }
