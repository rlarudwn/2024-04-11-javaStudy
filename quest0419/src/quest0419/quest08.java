package quest0419;

public class quest08 {

	public static void main(String[] args) {
		int even = 0;
		int odd = 0;
		for(int i = 3 ; i <= 4462 ; i++) {
			if(i % 2 == 0)
				even += i;
			else
				odd += i;
		}
		System.out.println("짝수: " + even);
		System.out.println("홀수: " + odd);

	}

}
