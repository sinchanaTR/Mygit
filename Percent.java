public class Percent
{
	public static void main(String[] param)
	{
		System.out.println("invoked main method");
		arrayOfPercentage();
	}
	public static void arrayOfPercentage()
	{
	double[] percent={88.96,76.33,7.8};
	int sizeOfArray=percent.length;
	System.out.println("total elements " +sizeOfArray);
	double elementAtIndex1=percent[1];
	System.out.println("elementAtIndex1 " +elementAtIndex1);
	}

}