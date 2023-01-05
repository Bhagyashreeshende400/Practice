package ExceptionHandling;

public class Example_4 
{
public static void main(String[] args) 
{
	int[]arr=new int[4];
	
//{
	//System.out.println(arr[4]);
//}
try 
{
	arr[3]=10;
}

catch(ArrayIndexOutOfBoundsException s)

{
System.out.println("ArrayIndexOutOfBoundsException Handled");

	}

try 
{
	arr[2]=20;
}

catch(ArrayIndexOutOfBoundsException d) 
{
	System.out.println("ArrayIndexOutOfBoundsException Handled");
}
}
{
	System.out.println("Hi");
	System.out.println("Hello");
	
}
}

