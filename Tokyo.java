public class Tokyo
{
	public static void main(String[] param)
	{
		System.out.println("invoked main method");
		arrayOfEmail();
	}
	public static void arrayOfEmail()
	{
	String[] email={"sinchana.sj59@gmail.com","sinchanajain1997@gmail.com","sinchanaxwork@gmail.com"};
	int sizeOfArray=email.length;
	System.out.println("total elements " +sizeOfArray);
	String elementAtIndex1=email[1];
	System.out.println("elementAtIndex1 " +elementAtIndex1);
	}

}