/*Type conversion and Type Casting

boolean
short
char
long
int
float
double
String
*/

class ConverterDemo{
	public static void main(String[] args){
		boolean bo =true;
		short sh = 55;
		byte by = 12;
		char ch = 'a';
		long lo = 111;
		int in = 45;
		float fl = 65/8f;
		double db = 78.9766;
		String st = "HI";
		
		lo=by; //Type conversion
		
		sh=(short)lo; //casting
		
		fl=in;
		
		in=(int)db;
		
		
		in=100;
		ch=(char)in;
		
		
		System.out.println("Value of boolean "+bo);
		System.out.println("Value of short "+sh);
		System.out.println("Value of byte "+by);
		System.out.println("Value of char "+ch);
		System.out.println("Value of long "+lo);
		System.out.println("Value of int "+in);
		System.out.println("Value of float "+fl);
		System.out.println("Value of double "+db);
		System.out.println("Value of String "+st);
		
		
	}
}