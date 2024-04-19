package quest0419;

import java.util.Scanner;

public class quest12 {

	public static void main(String[] args) {
		int cnt_3 = 0;
		int cnt_5 = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("10개 정수 입력, 각 정수는 띄어쓰기로 구분 : ");
		for(int i = 1 ; i <=10 ; i++) {
			int num = scanner.nextInt();
			if(num % 3 ==0)
				cnt_3++;
			if(num % 5 ==0)
				cnt_5++;
		}
		System.out.println(cnt_3);
		System.out.println(cnt_5);
		
		scanner.close();
	}

}
