package quest0418;

public class quest08 {

	public static void main(String[] args) {
		
		int sum = 0;
		/*for(int i = 1 ; i <= 10 ; i++)
			if (i % 2 == 0)
				sum -= i;
			else
				sum += i;
		System.out.println(sum);*/
		
		int cnt = 1;
		for(int i = 1 ; i <= 10 ; i++) {
			sum += i * cnt;
			cnt *= -1;
		}
		System.out.println(sum);
		

	}

}
