package chapter03_2;

public class 제어문_조건문_02 {

	public static void main(String[] args) {

		int num_1, num_2, num_3;
		
		num_1 = (int)(Math.random()*100)+1;
		num_2 = (int)(Math.random()*100)+1;
		num_3 = (int)(Math.random()*100)+1;
		
		int max = num_1;
		if(max < num_2)
			max = num_2;		
		if(max < num_3)
			max = num_3;
		System.out.println(max);
		int min = num_1;
		if(min > num_2)
			min = num_2;		
		if(min > num_3)
			min = num_3;
		System.out.println(min);
		
	}

}
