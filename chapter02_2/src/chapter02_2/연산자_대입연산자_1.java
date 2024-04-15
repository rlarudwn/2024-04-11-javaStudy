/*
		대입연산자	=> 메모리에 저장
					=> 변수
			=> = => int a = 10;
					=> 10을 a라는 메모리에 저장 (대입)
			=> 형변환
				int a = 'A';
					=> 'A' -> 65로 변경후 저장
				long l = 20;
					=> 20 -> 20L
				double d = 20;
					=> 20 -> 20.0
		복합대입연산자
		
		+= 	=> a += 10	==> a = a + 10
		-=	=> a -= 10	==> a = a - 10
		*=	=> a *= 10	==> a = a * 10
		*=	=> a /= 10	==> a = a / 10
		%=	=> a %= 10	==> a = a % 10
 
 */

package chapter02_2;

public class 연산자_대입연산자_1 {

	public static void main(String[] args) {

		int score1 = 10;
		int score2 = 5;
		score1+=score2;
		System.out.println(score1);
		score1-=score2;
		System.out.println(score1);

	}

}
