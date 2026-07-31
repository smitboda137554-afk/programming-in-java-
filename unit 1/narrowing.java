class narrowing 
{
	public static void main(String[] args)
	{
		double mydouble = 98.23;
		int myint = (int) mydouble;	

		System.out.println("double:" + mydouble);
		System.out.println("converted:" + myint);
	}
}