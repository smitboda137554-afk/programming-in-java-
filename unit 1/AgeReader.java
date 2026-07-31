import java.lang.*;
import java.util.Scanner;

class AgeReader
{
	public static void main(String args[])
	{
		int age;
	
		System.out.println("enter your Age:");

		Scanner sc = new Scanner(System.in);

		age = sc.nextInt();
		
		System.out.println("Wow, you are " + age + " years old!");
	}
}