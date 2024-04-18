package quest0417;

public class quest11 {

	public static void main(String[] args) {
		
		int num_1 = (int)(Math.random()*100)+1;
		int num_2 = (int)(Math.random()*100)+1;
		int op = (int)(Math.random()*4);
		double num_3 = 0;
		if (op == 0) num_3 = num_1 + num_2;
		else if (op == 1) num_3 = num_1 - num_2;
		else if (op == 2) num_3 = num_1 * num_2;
		else if (op == 3) num_3 = (double)num_1 / num_2;
		
		System.out.printf("%d %d %.2f", num_1, num_2, num_3);

	}

}
