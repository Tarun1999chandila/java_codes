package l7;
import java.util.Scanner;
public class binarystring {

	static Scanner scn= new Scanner(System.in);
	public static void main(String[] args) {
	String n=scn.next();
		//binarystring(n,"");
	dictio("1125","");
		
	}
	public static void binarystring(String ques,String ans){
		if(ques.length()==0){
			System.out.println(ans);
			return;
		}
		char ch=ques.charAt(0);
		String rq=ques.substring(1);
		if(ch=='?'){
		binarystring(rq,ans+0);
			binarystring(rq,ans+1);
		}
		else{
			binarystring(rq,ans+ch);
		}
	}
	public static void dictio(String ques,String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch=ques.charAt(0);
		String roq=ques.substring(1);
		String code=getcode(ch);
	
		for(int i=0;i<code.length();i++) {
			if(code.length()<=26) {
			dictio(roq,ans+code.charAt(i));
			}
			else {
				return;
			}
		}
		
		
	}
	public static String getcode(char ch) {
		if(ch==1) {
			return "a";
		}
		else if(ch==2){
			return "b";
			
		}
		else if(ch==3){
			return "c";
			
		}
		else if(ch==4){
			 return "d";
			
		}
		else if(ch==5){
			return "e";
			
		}
		else if(ch==6){
			return "f";
			
		}
		else if(ch==7){
			return "g";
			
		}
		else if(ch==8){
			return "h";
			
		}
		else if(ch==9){
			return "i";
			
		}
		else if(ch==10){
			return "j";
			
		}
		else if(ch==11){
			return "k";
			
		}
		else if(ch==12){
			return "l";
			
		}
		else if(ch==13){
			return "m";
			
		}
		else if(ch==14){
			return "n";
			
		}
		else if(ch==15){
			return "o";
			
		}
		else if(ch==16){
			return "p";
			
		}
		else if(ch==17){
			return "q";
			
		}
		else if(ch==18){
			return "r";
			
		}
		else if(ch==19){
			return "s";
			
		}
		else if(ch==20){
			return "t";
			
		}
		else if(ch==21){
			return "u";
			
		}
		else if(ch==22){
			return "v";
			
		}
		else if(ch==23){
			return "w";
			
		}
		else if(ch==24){
			return "x";
			
		}
		else if(ch==25){
			return "y";
			
		}
		else if(ch==26){
			return "z";
			
		}
		else {
			return "";
		}
		
		
	}

}
