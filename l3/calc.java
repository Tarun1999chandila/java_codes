package l3;

import java.util.Scanner;

public class calc {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		char ch=scn.next().charAt(0);
		int N1=scn.nextInt();
		int N2=scn.nextInt();

		int c=0;
			
				
			if(ch=='*'){
				c=N1*N2;
			}
			else if(ch=='+' ){
				c=N1+N2;
			}
			else if(ch=='-'){
				c=N1-N2;
			}
			else if(ch=='/'||N2!=0){
				c=N1/N2;
			}
			else if(ch=='%'||N2!=0){
				c=N1%N2;
			}
			else{
				System.out.println("Invalid operation.Try again");
				
			}
			
			
			System.out.println(c);
			
			//while(ch!='X');
		}
		}

	
