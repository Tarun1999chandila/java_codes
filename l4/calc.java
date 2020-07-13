package l4;
import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int c=0;
boolean res=true;
while(res){
char ch=scn.next().charAt(0);
//if(ch=='*'||ch=='+'||ch=='-'||ch=='/'||ch=='%'){

char x=0;


	if(ch=='*'){
		int N1=scn.nextInt();
int N2=scn.nextInt();
		c=N1*N2;
	}
	else if(ch=='+' ){
		int N1=scn.nextInt();
int N2=scn.nextInt();
		c=N1+N2;
	}
	else if(ch=='-'){
		int N1=scn.nextInt();
int N2=scn.nextInt();
		c=N1-N2;
	}
	else if(ch=='/'){
		int N1=scn.nextInt();
int N2=scn.nextInt();
		if(N2==0){
				System.exit(0);
			}
		c=N1/N2;
	}
		else if(ch=='%'){
			int N1=scn.nextInt();
int N2=scn.nextInt();
			if(N2==0){
				System.exit(0);
			}
		c=N1%N2;
	}
	
	
	
	
	System.out.println(c);
	//char ch=scn.next().charAt(0);
	//if{
		
//ch = scn.next().charAt(0);
	
	}
	
	
	//}
	 char ch=1;
	if(ch=='x'||ch=='X'){
		System.exit(0);
		
	}
	//if(ch!='*'||ch!='+'||ch!='-'||ch!='%'||ch!='/'||ch!='X'||ch!='x'){
		else{
		System.out.println("Invalid operation.Try again");
		//ch = scn.next().charAt(0);
		
	
	}
	}
	
}

