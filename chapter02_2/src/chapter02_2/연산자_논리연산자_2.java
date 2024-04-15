package chapter02_2;

public class 연산자_논리연산자_2 {

	public static void main(String[] args) {
		int score = (int)(Math.random()*100)+1;
		
		
		
		boolean bCheck = (score >= 60) && (score % 2 == 0);
		System.out.println(score);
		System.out.println(bCheck);
		
		bCheck = (score >= 40) && (score % 2 !=0);
		System.out.println(bCheck);
		
	}

}
