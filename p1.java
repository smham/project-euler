package euler1;

public class Sum {
	public static void main(String...args)
	{
		int i,sum=0;
		
		for(i=1;i<1000;i++)
		{
			if(i%3==0||i%5==0) sum+=i;
		}
		
		System.out.println("Sum is "+sum);
	}
}
