package ExceptionHandling;

public class Sample1
{
public static void main(String[] args) 
{
	int []ar=new int[4];
	
	ar[3]=40;
	try
	{
		ar[6]=40;
	}
	catch(ArrayIndexOutOfBoundsException d)
	{
		System.out.println("Array Index Out Of Bounds Exception Handled");
	}
System.out.println("Hi How are you");
}
}

