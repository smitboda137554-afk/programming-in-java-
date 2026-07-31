import java.lang .*;
import java.util.Scanner;

class ArthScan
{
	public static void main(String args[])
	{
		int no1;
		int no2;
		int sum;
		int sub;
		float div;
		float multi;

		System.out.println("Enter your no1");
		Scanner sc = new Scanner(System.in);

		no1 = sc.nextInt();

		System.out.println("Enter your no2");
		Scanner sc1 = new Scanner(System.in);

		no2 = sc1.nextInt();

		sum= no1 +  no2;
		sub = no1 - no2;
		div = no1 / no2;
		mulit = no1 * no2;

		System.out.print("your sum:"+ sum);
		System.out.print("your sub:" + sub);
		System.out.print("your div:" + div);
		System.out.print("your multi:" + multi);
	}
}