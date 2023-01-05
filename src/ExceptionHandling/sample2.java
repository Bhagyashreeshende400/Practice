package ExceptionHandling;

public class sample2 
{
public static void main(String[] args) 
{
	String s1="Shende";
	try 
	{
		s1.charAt(2);
		
	}

catch(StringIndexOutOfBoundsException e)
{
	System.out.println("Exception Handled");
}
	System.out.println("I am fine");

}
}