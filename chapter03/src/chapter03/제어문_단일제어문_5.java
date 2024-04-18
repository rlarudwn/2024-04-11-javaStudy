package chapter03;

import java.util.Scanner;

public class 제어문_단일제어문_5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num_1, num_2;
		char op;
		System.out.print("첫번째 정수 입력");
		num_1 = scanner.nextInt();
		System.out.print("사칙연산 입력 (+, -, /, *)");
		op = scanner.next().charAt(0);
		System.out.print("두번째 정수 입력");
		num_2 = scanner.nextInt();
		/*switch(op) {
		case  '+' : System.out.println(num_1 + " + " + num_2 + " = " + (num_1 + num_2)); 
		break;
		case  '-' : System.out.println(num_1 + " - " + num_2 + " = " + (num_1 - num_2)); 
		break;
		case  '*' : System.out.println(num_1 + " * " + num_2 + " = " + (num_1 * num_2)); 
		break;
		case  '/' : if(num_2 != 0)
			System.out.println(num_1 + " / " + num_2 + " = " + (num_1 / num_2));
		else
			System.out.println("두번째 정수가 0일 경우 나눌 수 없습니다");
		break;
		}*/

		if(op == '+')
			System.out.println(num_1 + " + " + num_2 + " = " + (num_1 + num_2));
		if(op == '-')
			System.out.println(num_1 + " - " + num_2 + " = " + (num_1 - num_2));
		if(op == '*')
			System.out.println(num_1 + " * " + num_2 + " = " + (num_1 * num_2));
		if(op == '/')
			if(num_2 != 0)
				System.out.println(num_1 + " / " + num_2 + " = " + (num_1 / num_2));
			else
				System.out.println("두번째 정수가 0일 경우 나눌 수 없습니다");
	}

}
