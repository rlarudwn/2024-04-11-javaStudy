package chapter02;

import java.util.Arrays;

public class 변수_8 {

	public static void main(String[] args) {
		
		int num_1 = 50, num_2 = 20, num_3 = 70, num_4 = 95, num_5 = 38;
		int[] num = {num_1, num_2, num_3, num_4, num_5};
		System.out.println(Arrays.toString(num));
		for (int i = 0 ; i < num.length ; i++)
			for(int j = 0 ; j < num.length ; j++)
				if(num[i] < num[j]) {
					num[j] = num[j] + num[i];
					num[i] = num[j] - num[i];
					num[j] = num[j] - num[i];					
				}
		System.out.println(Arrays.toString(num));
			

		
	}

}
