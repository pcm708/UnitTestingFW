
public class StringFunctionClass {
	
	public boolean checkIfPalindrome(String s) {
		String s1="";
		if(s.length()<=1)
			return true;
		for(int i=s.length()-1;i>=0;i--) {
			s1=s1+s.charAt(i);
		}
		
		if(s.equals(s1))
		return true;
		
		return false;
	}
}
