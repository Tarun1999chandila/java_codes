package l8;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindrome("nitin","");

	}
	public static boolean ispalindrome(String part) {
		int left=0;
		int right=part.length()-1;
		while(left<right) {
			if(part.charAt(left)!=part.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
public static void palindrome(String ques,String ans) {
	if(ques.length()==0) {
		System.out.println(ans);
		return;
	}
	for(int i=1;i<=ques.length();i++) {
		String part=ques.substring(0,i);
		String roq=ques.substring(i);
		
	
	if(ispalindrome(part)) {
		palindrome(roq,ans+part+" ");
	}

	}
	
}

}
