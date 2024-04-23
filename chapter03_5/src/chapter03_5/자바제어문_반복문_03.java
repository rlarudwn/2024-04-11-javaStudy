package chapter03_5;

public class 자바제어문_반복문_03 {

	public static void main(String[] args) {
		int cnt_3, cnt_5, cnt_7;
		cnt_3 = cnt_5 = cnt_7 = 0;
		for(int i = 1 ; i <= 100 ; i++) {
			if(i % 3 == 0)
				cnt_3++;
			if(i % 5 == 0)
				cnt_5++;
			if(i % 7 == 0)
				cnt_7++;
		}
		System.out.println(cnt_3);
		System.out.println(cnt_5);
		System.out.println(cnt_7);
	}

}
