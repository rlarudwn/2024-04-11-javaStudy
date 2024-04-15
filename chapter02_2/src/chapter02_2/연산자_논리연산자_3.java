package chapter02_2;

public class 연산자_논리연산자_3 {

	public static void main(String[] args) {
		
		int score = (int)(Math.random()*100)+1;
		boolean bCheck = (score < 30) || (score > 70);
		System.out.println(score);
		System.out.println(bCheck);

	}

}
