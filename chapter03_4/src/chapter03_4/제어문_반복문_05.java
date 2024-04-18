package chapter03_4;

public class 제어문_반복문_05 {

	public static void main(String[] args) {
		int even = 0;
		int odd = 0;
		int sum = 0;
		int even_cnt = 0 ,odd_cnt = 0;
		for (int i = 1 ; i <= 100 ; i++) {
			if(i % 2 == 0) {
				even += i;
				even_cnt++;
			}
			else {
				odd += i;
				odd_cnt++;
			}
			sum += i;
		}
		System.out.printf("짝수 합 : %d, 짝수 개수 : %d\n", even, even_cnt);
		System.out.printf("홀수 합 : %d, 홀수 개수 : %d\n", odd, odd_cnt);
		System.out.printf("전체 합 : %d", sum);
			

	}

}
