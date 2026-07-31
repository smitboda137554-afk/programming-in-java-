class Condition
{
	public static void main(String[] args)
	{
		int age;
		age = 13;
		if(age >= 18)
		{
			System.out.println("you have right to vote");
		}
		else
		{
			if(age > 15)
			{
				System.out.println("your have right to vote in childeran");
			}
			else
			{
				System.out.println("you not have any right");
			}
		}
	}
}