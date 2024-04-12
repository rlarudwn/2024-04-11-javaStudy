/*
 	byte, char, int, long, float, double
 	기타: boolean
 	
 	1. 데이터형의 크기
 		byte < char < int < long < float < double
 		
 		byte + byte = int
 		char + char = int
 */
package chapter02;

public class 변수_5 {

	public static void main(String[] args) {
		
		int a = 'A';
		char c = 65;
		
		System.out.println(a +" " +c);
		
		double d = 'A';
		System.out.println(d);
		
		byte b1 = 10, b2 = 110;
		byte b3 = (byte) (b1 + b2);


	}

}
