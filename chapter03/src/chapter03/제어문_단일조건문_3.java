/*
		if (조건문)	=> 웹 (page를 나눈 경우, 상세보기)
			=> 사람	=> 한눈에 볼 수 있는 이미지	=> 15 ~ 20
 */
package chapter03;

public class 제어문_단일조건문_3 {

	public static void display() {
		int sum = 0;
		int num = (int)(Math.random()*100)+1;
		System.out.printf("1번째 : %d\n", num);
		if(num >= 50)
			sum += num;
		
		num = (int)(Math.random()*100)+1;
		System.out.printf("2번째 : %d\n", num);
		if(num >= 50)
			sum += num;
		
		num = (int)(Math.random()*100)+1;
		System.out.printf("3번째 : %d\n", num);
		if(num >= 50)
			sum += num;

		
		System.out.printf("결과 : %d", sum);
		
		
	}
	public static void main(String[] args) {
		
		int sum = 0;
		int num = (int)(Math.random()*100)+1;
		System.out.printf("1번째 : %d\n", num);
		if(num >= 50)
			sum += num;
		
		num = (int)(Math.random()*100)+1;
		System.out.printf("2번째 : %d\n", num);
		if(num >= 50)
			sum += num;
		
		num = (int)(Math.random()*100)+1;
		System.out.printf("3번째 : %d\n", num);
		if(num >= 50)
			sum += num;

		
		System.out.printf("결과 : %d", sum);
		
		
	}
}
