package stjuly;

public class Reversestr {

	public static void main(String[] args) {
		String str="thampi",rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
     System.out.println(" Reversed String= "+rev);
	}

}