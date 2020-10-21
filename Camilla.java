public class Camilla
{
	public static void main(String[] param)
	{
		System.out.println("invoked main method");
		arrayOfVowel();
	}
	public static void arrayOfVowel()
	{
	String[] vowel={"A","E","I","O","U"};
	int sizeOfArray=vowel.length;
	System.out.println("total elements " +sizeOfArray);
	String elementAtIndex1=vowel[1];
	System.out.println("elementAtIndex1 " +elementAtIndex1);
	for(int i=0;i<=vowel.length-1;i++)
	{
		System.out.println(vowel[i]+"");
	}
	for(int i=vowel.length-1;i>=0;i--)
	{
		System.out.println(vowel[i]+"");
	}
	}

}