import java.lang.*;
import java.util.Scanner;

class HelloScanner
{
	public static void main (String args[])
	{
		int no1;
	
		System.out .println("Enter No:");
		Scanner sc = new Scanner (System.in);

		no1 = sc.nextInt();

		System.out.println("your enter number is:" +no1);
	}
}