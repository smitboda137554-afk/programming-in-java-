import java.util.Scanner;

class NameReader
{
	public static void main(String args[])
	{
		String FullName;

		System.out.println("Enter your full name:");

		Scanner sc = new Scanner(System.in);

		FullName = sc.nextLine();

		System.out.println("Enter your full name is :" + FullName);

	}
}