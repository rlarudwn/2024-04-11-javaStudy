package chapter03_5;

public class 자바제어문_반복문_04 {

	public static void main(String[] args) {
		int min = 101, max = 0;
		for(int i = 1 ; i <= 10 ; i++) {
			int num = (int)(Math.random()*100)+1;
			if(num < min)
				min = num;
			if(num > max)
				max = num;
			System.out.print(num + "\t");
		}
		System.out.println();
		System.out.println("최소값 : " + min + "\t 최대값 : " + max);
	}

}
