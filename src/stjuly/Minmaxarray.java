package stjuly;

public class Minmaxarray {

	public static void main(String[] args) {
		int[] numbers= {3,9,5,8,-2,7,-5,6,10};
		int max=3;
		int min=3;
		for(int num:numbers)
		{
			if(num>max)
				max=num;
			if(num<min)
				min=num;
		}
        System.out.println("Maximum="+max);
        System.out.println("Minimum="+min);
	}
}
