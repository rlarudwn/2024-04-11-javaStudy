/*
 		비교연산자	=> 숫자에서만 사용 가능 (문자열은 비교 불가능)
 			비교연산자는 결과값	=> true / false
 		
 		== 	=> 같다
 			JavaScript (===)
 			Oracle (=)
 		!=	=> 같지 않다
 		<	=> 작다 (왼쪽 데이터 기준)
 		>	=> 크다
 		<= 	=> 작거나 같다
 		>=	=> 크거나 같다
 		
 		1)  단항연산자 / 산술연산자 / 비교연산자 / 대입연산자 / 논리연산자 / 형변환
 			변수 / 연산자 / 제어문	=> 묶음
 */

package chapter02_2;

public class 연산자_비교연산자 {

	public static void main(String[] args) {
		int a = (int)(Math.random()*100)+1;
		int b = (int)(Math.random()*100)+1;
		
		System.out.println("a = "+a+" b = "+b);
		System.out.println("====== 비교 =======");
		
		System.out.println("a == b " + (a==b));
		System.out.println("a != b " + (a!=b));
		System.out.println("a < b " + (a<b));
		System.out.println("a > b " + (a>b));
		System.out.println("a <= b " + (a<=b));
		System.out.println("a >= b " + (a>=b));
		
		System.out.println("====== 알파벳 비교 ======");
		char c = (char)((int)(Math.random()*26)+65);
		char d = (char)((int)(Math.random()*26)+65);
		System.out.println("c == d " + (c==d));
		System.out.println("c != d " + (c!=b));
		System.out.println("c < d " + (c<d));
		System.out.println("c > d " + (c>d));
		System.out.println("c <= d " + (c<=d));
		System.out.println("c >= d " + (c>=d));
	

		char c1 = ' ';
	}

}
