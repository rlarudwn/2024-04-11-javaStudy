package chapter03_4;

public class 제어문_반복문_03 {

	public static void main(String[] args) {

		int sum = 0;
		for(int i = 1 ; i <= 100 ; i++) {
			sum += i;
			System.out.printf("i = %d, sum = %d\n", i, sum);
		}
		System.out.println(sum);
		
		int sum_1 = 0;
		for(int i = 1 ; i <= 100 ; i++) {
			if(i % 5 == 0)
				continue;
			if(i % 3 == 0)
				continue;
			if(i % 7 == 0)
				continue;
			sum_1 += i;
			System.out.printf("i = %d, sum = %d\n", i, sum_1);
		}
	}

}
