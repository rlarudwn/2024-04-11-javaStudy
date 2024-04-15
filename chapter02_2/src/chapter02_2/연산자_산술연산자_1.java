/*	
		+ 연산자
			1) 산술연산자 (더하기 연산)
				10 + 10 = 20
			2) 문자열 결합
				"7" + 7	= "77"
				7 + "7" = "77"
				7 + 7 + "7" = "147"
				7 + "7" + 7 * 7 = "7749"
				
 */

package chapter02_2;

public class 연산자_산술연산자_1 {

	public static void main(String[] args) {
		
		char c = 'A';
		int i = 10;
		double d = 10.5;
		System.out.println(d + i);
		
		// byte + byte = int
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = (byte)(b1 + b2);
		int b4 = b1 + b2;
		
		System.out.println(b3);
		
		// char + char = int
		char c1 = 'A';
		char c2 = 'B';
		char c3 = (char)(c1 + c2);
		int c4 = c1 + c2;
		System.out.println(c3);
		
		// char + byte + double + float = double
		char d1 = 'A';
		byte d2 = 100;
		double d3 = 10.5;
		float d4 = 10.5f;
		System.out.println(d1 + d2 + d3 + d4);
		
		//int + long + float = float
		int e1 = 100;
		long e2 = 100l;
		float e3 = 10.5f;
		System.out.println(e1 + e2 + e3);
	}

}
