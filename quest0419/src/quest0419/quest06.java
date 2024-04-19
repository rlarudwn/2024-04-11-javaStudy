package quest0419;

import java.util.Scanner;

public class quest06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num_1 = scanner.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num_2 = scanner.nextInt();
		int sum = 1;
		
		if(num_1 < num_2) {
			for(int i = num_1 ; i <= num_2 ; i++)
				sum *= i;
			System.out.println(sum);
		}
		else
			System.out.println("두번째 정수는 첫번째 정수보다 작은 수를 입력해야됩니다.");
		
		scanner.close();
	}

}
