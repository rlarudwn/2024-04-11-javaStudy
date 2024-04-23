package quest0420;

public class quest09 {

	public static void main(String[] args) {
		int sum_7 = 0;
		int sum_9 = 0;
		for(int i = 1 ; i <= 1000 ; i++) {
			if(i % 7 == 0)
				sum_7 += i;
			if(i % 9 == 0)
				sum_9 += i;
		}
		System.out.println("7의 배수의 합 : " + sum_7);
		System.out.println("9의 배수의 합 : " + sum_9);
		System.out.println("7의 배수 + 9의 배수 : "+ (sum_7+sum_9));

	}

}
