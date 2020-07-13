package l8;
import java.util.Scanner;
public class upplow {
	static Scanner scn=new Scanner(System.in);

		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}
		public static void upplow(String str) {
		
			if(str.length==0)
					StringBuilder sb=new StringBuilder();
					for(int i=0;i<str.length();i++) {
						char ch=str.charAt(i);
						if(ch>='a'||ch<='z') {
							//sb.append(Character.toLowerCase(ch));
							
						}
						else if(Character.isLowerCase(ch)) {
							sb.append(Character.toUpperCase(ch));
					}
						
			}
//	char ch=scn.next().charAt(0);
		
		}
}
		



