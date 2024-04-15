package chapter02_2;

public class 연산자_논리연산자 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 9;
		
		int c = x & y;
		
		boolean bCheck = x != y && ++y == x;
		System.out.println(bCheck);
		System.out.println(x);
		System.out.println(y);

	}

}
