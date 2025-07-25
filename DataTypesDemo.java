package day2;

public class DataTypesDemo {

	public static void main(String[] args)
	{
      // Numeric data types
		
		int a=100,b=200;
		
		System.out.println("The value of a is:"+a);
		System.out.println("the value osf b is:"+b);
		System.out.println("the sum of a and b is:"+(a+b));
		
		byte by=-125;
		System.out.println(by);
		
		
		short sh=3535;
		System.out.println(sh);
		
		long l=123456789L;  //literal is needed L/l
		System.out.println(l);
		
		//Decimal Numbers - float,double
		
		float item_price=15.5f;   //literal is needed  F/f
		System.out.println(item_price);
		
		double dbl=123.548455;
		System.out.println(dbl);
		
		char grade='A';
		System.out.println(grade);
		
		String name="John";
		System.out.println(name);
		
		//char ch='ABC';  //Invalid
		//String ch='ABC'; //Invalid
		//String ch='A';  //Invalid
		//String ch="A";    //Valid
		
		//boolean bol=false;
		//System.out.println(bol);
		
		//boolean bl="true";   // this is not valid
		//boolean bl="false";  // this is not valid		
		
		//String bl=true;  // not valid
		//String bl="true";  //valid
	}

}
