package chapter_01_03_정리;

public class 자바제어문_조건문_3 {

	public static void main(String[] args) {

		char c = 'a';
		if(c >= 'A' && c <= 'Z') {
			System.out.printf("%c는(은) 대문자\n", c);
			System.out.printf("%c의 소문자는 %c", c, (char)(c+32));
		}
		else {
			System.out.printf("%c는(은) 소문자\n", c);
			System.out.printf("%c의 대문자는 %c", c, (char)(c-32));
		}
	}

}
