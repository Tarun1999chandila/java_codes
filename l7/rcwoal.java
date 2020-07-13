package l7;

public class rcwoal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//printss("abc","");
		//printkpc("145","");
		//;++
		permutation("abc","");
		//permutation1("abc","");
		//asciiss("abc","");
	}
public static void printss(String ques,String ans) {
	if(ques.length()==0) {
		System.out.println(ans);
		return;
	}
	char ch=ques.charAt(0);
	String roq=ques.substring(1);
	printss(roq,ans);
	printss(roq,ans+ch);
}
public static void printkpc(String ques,String ans) {
	if(ques.length()==0) {
		System.out.println(ans);
		return;
	}
	char ch=ques.charAt(0);
	String roq=ques.substring(1);
	String code=getCode(ch);
	for(int i=0;i<code.length();i++) {
		//printkpc(roq,ans);
		printkpc(roq,ans+code.charAt(i));
	}
	
	
}
public static String getCode(char ch) {

	if (ch == '1')

		return "abc";

	else if (ch == '2')

		return "def";

	else if (ch == '3')

		return "ghi";

	else if (ch == '4')

		return "jk";

	else if (ch == '5')

		return "lmno";

	else if (ch == '6')

		return "pqr";

	else if (ch == '7')

		return "stu";

	else if (ch == '8')

		return "vwx";

	else if (ch == '9')

		return "yz";

	else if (ch == '0')

		return "@#";

	else

		return "";

}
public static void permutation(String ques,String ans) {
	if(ques.length()==0) {
		System.out.println(ans);
		return;
	}
	
	char ch=ques.charAt(0);
	String roq=ques.substring(1);
	for(int i=0;i<=ans.length();i++) {
		permutation(roq,ans.substring(0,i)+ch+ans.substring(i));
	}
	
}
public static void permutation1(String ques,String ans) {
	if(ques.length()==0) {
		System.out.println(ans);
		return;
	}
	for(int i=0;i<ques.length();i++) {
	char ch=ques.charAt(i);
	String roq=ques.substring(0,i)+ques.substring(i+1);
	
		permutation1(roq,ans+ch);
	}
	
}
public static void asciiss(String ques,String ans) {
	if(ques.length()==0) {
		System.out.println(ans);
		return;
		
	}
	char ch=ques.charAt(0);
	int as=ch;
	String roq=ques.substring(1);
	asciiss(roq,ans);
	asciiss(roq,ans+ch);
	asciiss(roq,ans+ch+as);
}

}

