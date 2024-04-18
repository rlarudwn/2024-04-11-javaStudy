
package chapter03_3;

public class 제어문_선택문_4 {

	public static void main(String[] args) {
		
		int score = (int)(Math.random()*11);
		System.out.println("score : " + score);
		switch (score) {
		case 10 : 
		case 9 : System.out.println("A"); 
			break;
		case 8 : System.out.println("B");
			break;
		case 7 : System.out.println("C");
			break;
		case 6 : System.out.println("D");
			break;
		default : System.out.println("F");
			break;
		}
	}

}
