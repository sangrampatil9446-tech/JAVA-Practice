package day2;

public class VariablesDemo {

	public static void main(String[] args) 
	{
		//int a;  //decleration
		//a=100;  //assignment
		
		/*int a=100;  //decleration+assignment
		System.out.println(a); //100
		
		a=200;
		System.out.println(a);
		*/
		
		//Approach 1- If all the variables belongs to different data types
		/*int a=100;
		int b=200;
		int c=300;
		*/
		
		//Approach 2 -If all the variables belong to same data type
		/*int a,b,c;
		a=100;
		b=200; 
		c=300;
		*/
		
		//Approach 3 -If all the variables belong to same data type
		int a=100,b=200,c=300;
		
		System.out.println("the value of a is:"+a);
		System.out.println("the value of b is:"+b);
		System.out.println("the value of c is:"+c);
		
		System.out.println(a+" "+b+" "+c); //100 200 300 
	}

}
