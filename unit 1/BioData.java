import java.util.Scanner ;

class BioData
{
	public static void main(String args[])
	{
		int dob;
		int age;
		String fullname;

		System.out.println("enter your full name:");
		Scanner sc = new Scanner(System.in);
		fullname = sc.nextLine();

		System.out.println("enter your age:");
		Scanner sc1 = new Scanner(System.in);
		age = sc1.nextInt();

		System.out.println("enter your dob:");
		Scanner sc2 = new Scanner(System.in);
		dob = sc2.nextInt();

		System.out.println("your name is"+ fullname + "and your dob is" + dob + "and your age is" + age );
	}
}