package quest0419;

import java.util.Scanner;

public class quest11 {

	public static void main(String[] args) {
		int cnt = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("10개 정수 입력, 각 정수는 띄어쓰기로 구분 : ");
		for(int i = 1 ; i <=10 ; i++) {
			int num = scanner.nextInt();
			if(num % 2 ==0)
				cnt++;

		}
		System.out.println(cnt);
		
		scanner.close();
	}

}
