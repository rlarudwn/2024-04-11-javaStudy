/*
"url":"/watch?v=smdmEhkIRVc\u0026pp=ygUJ67Ck7JaR6rCx"
 */
package chapter03_while_1;

import java.util.Scanner;

public class 자바제어문_반복문_09 {

	public static void main(String[] args) throws Exception {
		/*Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe "+"http://youtube.com/embed/smdmEhkIRVc\\u0026pp=ygUJ67Ck7JaR6rCx");*/
		Scanner scanner = new Scanner(System.in);
		int i = 1;
		System.out.print("정수 입력: ");
		int num = scanner.nextInt();
		int sum = 0;
		while(i <= num) {
			sum += i;
			i++;
		}
		System.out.println("while 결과값 sum = " + sum);
		sum = 0;
		for(i = 1 ; i <= num ; i++)
			sum += i;
		System.out.println("for 결과값 sum = " + sum);
	}

}
