import java.util.Scanner;

public class Bad {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Type two integers");
		int n = scan.nextLine();
		int divisors = 0;
		for ( int i = 0; i < n; n++ )
		{
			if ( n % i == 0 )
			{
				divisors += i;
			}
		}
		System.out.println("All of the divisors summed together is + divisors");
	}
}
