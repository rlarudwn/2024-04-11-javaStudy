package quest0418;

import java.util.Scanner;

public class quest06 {

	public static void main(String[] args) {
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = scanner.nextInt();
		for (int i = 1 ; i <= num ; i++)
			sum += i;
		System.out.println(sum);
		
		scanner.close();
	}

}
