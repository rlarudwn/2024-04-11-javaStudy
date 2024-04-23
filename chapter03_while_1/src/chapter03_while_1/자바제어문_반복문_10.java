package chapter03_while_1;

public class 자바제어문_반복문_10 {

	public static void main(String[] args) {
		int cnt_0 = 0;
		int cnt_1 = 0;
		int i = 1;
		while(i <= 100) {
			int num = (int)(Math.random()*2);
			if(num == 0)
				cnt_0++;
			else
				cnt_1++;
			i++;
		}
		System.out.println("0의 개수 : " + cnt_0);
		System.out.println("1의 개수 : " + cnt_1);
	}

}
