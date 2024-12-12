package stringpgms;

public class Stringpalin {

	public static void main(String[] args) {
		
		String s="malayalam",rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		if(s.equals(rev))
		{
			System.out.println(s+ " is a palindrome");
		}
		else
		{
			System.out.println(s+ " is not a palindrome");
		}
	}

}
