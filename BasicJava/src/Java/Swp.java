package Java;

public class Swp {
	//Without using third variable.
		public static void main(String[] arags){
		int a,b;
		a=15;
		b=27;
		System.out.println("Befor :a,b="+a+", "+ +b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After :a,b="+a+", "+ +b);
		}
	}
	//With using third variable.
	/*public class Swp {
	 
	 public static void main(String[] args) {
	     
	   int a, b, temp;
	   a = 15;
	   b = 27;
	   System.out.println("Before swapping : a, b = "+a+", "+ + b);
	   temp = a;
	   a = b;
	   b = temp;   
	  System.out.println("After swapping : a, b = "+a+", "+ + b);
	 }
	 }*/
	 
