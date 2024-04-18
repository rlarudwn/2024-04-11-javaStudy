package quest0418;

public class quest04 {

	public static void main(String[] args) {
		/*for (int i = 1 ; i <= 10 ; i++)
			System.out.printf("%d\t", i*5);*/
		for (int i = 5 ; i <= 50 ; i += 5)
			if(i != 50)
				System.out.printf("%d,", i);
			else
				System.out.printf("%d", i);

	}

}
