package chapter02_2;

public class 연산자_단항연산자_1 {

	public static void main(String[] args) {

		/*int a = 10;
		int b = ++a + ++a + ++a;
		System.out.println(a + " " + b);*/
		
		int a = 10;
		a++;
		a++;
		a++;
		System.out.println(a);
		
		int b = 10;
		b--;
		b--;
		b--;
		System.out.println(b);
		
		int c = 10;
		++c;
		++c;
		++c;
		System.out.println(c);
		
		int d = 10;
		--d;
		--d;
		--d;
		System.out.println(d);
	}

}
