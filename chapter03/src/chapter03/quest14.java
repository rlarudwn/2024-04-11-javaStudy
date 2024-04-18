package chapter03;

import java.util.Scanner;
public class quest14{
	public static void main(String args[]){
		int money = 369;
		int money_100 = money / 100;
		int money_10 = money % 100 / 10;
		int money_1 = money % 10 / 1;
		System.out.printf("%d원은 100원짜리 %d개, 10원짜리 %d개, 1원짜리 %d개", money, money_100, money_10, money_1);
	}
}

