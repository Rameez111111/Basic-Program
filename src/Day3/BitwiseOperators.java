package Day3;

public class BitwiseOperators {

	public static void main(String[] args) {
	 int a= 60;  // 60 = 0011 1100
	 int b= 13; // 13 = 0000 1101
	 int c= 0;
	 c= a&b; // 12 = 000 1100
	 System.out.println("a&b ="+c);
	 c = a|b; // 61 = 0011 1101
	 System.out.println("a|b ="+c);
	 c = a^b;
	 System.out.println("a^b ="+c);
	 c = ~a;
     System.out.println("~a ="+c);
     c= a<<2;
	 System.out.println("a<<="+c);
	 c= a>>2;
	 System.out.println(">>a ="+c);
	 c =a>>>2;
	 System.out.println("a>>> ="+c);
	}

}
