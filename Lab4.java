public class Lab4
{
	public static void main(String[] args)
	{
		Calculator ti30 = new Calculator("3+2-3/4+(3*5+3)");
		System.out.println(ti30.toString());
		boolean is = ti30.convertPostfix();
		System.out.println("Postfix: " + ti30.getPostfix());
	}
}