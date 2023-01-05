package Methods;

public class Example7 
{

	public static void main(String[] args) 
	{
		addition(30,40);
        addition(10,20);
System.out.println("*******");
	
Example7 d=new Example7();
d.subtraction(40,10);
d.subtraction(70,10);
	
	}
	public static void addition(int num1,int num2)
	{
		System.out.println(num1+num2);
	}
	public void subtraction(int num1,int num2)
	{
    System.out.println(num1-num2);

	}

}