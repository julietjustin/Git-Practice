class IfElseExample
{
	public static void main(String args[])
	{
	    String name = args[0];
		short age = Short.parseShort(args[1]);
		
		if(age >= 18)
					
		{
			System.out.println("Name:"+name);
			System.out.println("Eligible for voting");
		}
			else
			{
				System.out.println("Not Eligible for voting");
			}
	}
}