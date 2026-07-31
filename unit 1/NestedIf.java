class NestedIf{
	public static void main(String args[]){
		int no1 = Integer.parseInt(args[0]);

		if(no1 <=18){
			if(no1<= 15)
			{
				System.out.println("VERY SOON YOU GET");
			}
			else{
				System.out.println("Not Eligible");
			}
		}
		else{
			System.out.println("Eligible");
		}
	}
}