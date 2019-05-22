import java.util.Scanner;

public class Bad {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		//I like println better. And : . Should only be one int.
		System.out.println("Type one integers: ");
                //Should be nextInt.
		int n = scan.nextInt();
		int divisors = 0;
                //Should be i++.
		for ( int i = 0; i < n; i++ )
		{
			if ( n % i == 0 )
			{
				divisors += i;
			}
		}
                //Wow I can't believe you put the quotes in the wrong place.
		System.out.println("All of the divisors summed together is " + divisors);
	}
}
