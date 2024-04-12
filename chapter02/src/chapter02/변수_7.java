/*
 		값을 교환
 		
 */
package chapter02;

public class 변수_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 500;
		int b = 300;
		int c = 500;
		int d = 300;
		int temp;
		temp = c;
		c = d;
		d = temp;
		System.out.println(c);
		System.out.println(d);
		b = b + a;
		a = b - a;
		b = b - a;
		System.out.println(a);
		System.out.println(b);
		
		char c1 = 'A';
		char c2 = 'b';
		c2 = (char) (c2 + c1);
		c1 = (char) (c2 - c1);
		c2 = (char) (c2 - c1);
		temp = c1;
		c1 = c2;
		c2 = (char)temp;
		System.out.println(c1);
		System.out.println(c2);

	}

}
