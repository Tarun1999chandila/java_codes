package l7;
import java.util.Scanner;

public class duplicate {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
	duplicate(str);
		//ascii2(str);
	}
public static void duplicate(String str){
	StringBuilder sb = new StringBuilder(str);

for(int i=0;i<str.length();i++){
	//for(int j=i+1;j<sb.length();j++){
	char ch=sb.charAt(i);
	
	if(i!=str.length()-1)
	{	
		char ch1=sb.charAt(i+1);
	
	if(ch==ch1){
		sb.deleteCharAt(i+1);
	}
str=sb.toString();

	}
}
System.out.print(str);
}
}

