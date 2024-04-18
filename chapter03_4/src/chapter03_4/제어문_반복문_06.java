package chapter03_4;

public class 제어문_반복문_06 {

	public static void main(String[] args) {
		/*for(char c = 'A' ; c <= 'z' ; c++) {
			if(c == 'Z' + 1)
				c = 'a';
			System.out.println(c);
		}*/
		
		for (char c = 'A' ; c <= 'Z' ; c++)
			System.out.println(c);
		for (char c = 'a' ; c <= 'z' ; c++)
			System.out.println(c);
		System.out.println();
		for (char c = 'Z' ; c >= 'A'; c--)
			System.out.println(c);

	}

}
