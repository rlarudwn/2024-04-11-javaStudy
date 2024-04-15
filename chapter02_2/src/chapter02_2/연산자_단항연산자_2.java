package chapter02_2;

public class 연산자_단항연산자_2 {

	public static void main(String[] args) {
		
		boolean bCheck = true;
		System.out.println(bCheck);
		System.out.println(!bCheck);
		
		while(true) {
			bCheck = !bCheck;
			if(bCheck == true)
				System.out.println("컴퓨터");
			else
				System.out.println("본인");
		}

	}

}
