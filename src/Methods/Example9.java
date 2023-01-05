package Methods;

public class Example9
{
	//static regular method call from same class

	//example1: static regular method call from same class
		//main method
		public static void main(String[] args)     //pre-defined method 
		{
			System.out.println("Hi");		
			
			m1();            //methodname();  
			m2();
			m2();
			Example10.m3();
			Example10.m4();
			Example10 s=new Example10();
			s.m5();
			s.m6();
			
			
			System.out.println("Hello");
		}
		//static -> regular method 
		public static void m1()               //user defined              
		{
			System.out.println("Running Static Regular Method: m1");
		}
		//static -> regular method 
		public static void m2()        //user defined              
		{
			System.out.println("running static regular method: m2");
		}
	}



















