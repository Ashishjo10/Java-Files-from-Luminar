package iterativestatement;

public class Pattern {

	public static void main(String[] args) 
	{
		int rows=5;
		for(int i=rows;i>=1;i--)
		{
			int n=rows-i+1;
			for(int j=1;j<=i;j++) 
			{
				System.out.print(n);
			  }
			System.out.println();
		}

	}

    }