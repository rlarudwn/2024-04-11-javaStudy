package quest0419;

public class quest09 {

	public static void main(String[] args) {
		int sum_2 = 0;
		int sum_3 = 0;
		for(int i = 0 ; i <= 12 ; i++)
			if(i % 2 == 0)
				sum_2 += i;
			else if(i % 3 == 0)
				sum_3 += i;
		System.out.println(sum_2);
		System.out.println(sum_3);
	}

}
