package chapter03_while_1;

public class 자바제어문_반복문_03 {

	public static void main(String[] args) {
		System.out.println("===== for문 =====");
		for(char c = 'A' ; c <= 'Z' ; c++)
			System.out.print(c + " ");
		
		System.out.println();
		
		System.out.println("===== while문 =====");
		char c = 'Z';
		while(c >= 'A') {
			System.out.print(c + " ");
			c--;
		}
	}

}
