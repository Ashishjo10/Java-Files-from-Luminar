package stringpgms;

public class Stringpgms {

	public static void main(String[] args) {
		
		//tocharArray
		String s4="hello";
		char[] c=s4.toCharArray();
		for(char ele:c)
		{
			System.out.println(ele);
		}
		
		//split
		String s5="Hello World";
		String[] st=s5.split(" ");
		for(String e:st)
		{
			System.out.println(e);
		}
		
		//substring
		System.out.println(s5.substring(1));
		System.out.println(s5.substring(1, 5));
		
		//replace
		String s="King Kong";
		System.out.println(s.replace("Kong", "King"));
		
		//trim
		System.out.println(s5.trim());
		
		
		
		
		
		
		
		
		
		
	}
}
