package quest0420;

public class quest07 {

	public static void main(String[] args) {
		int even = 0, odd = 0;
		for(int i = 1 ; i <= 30 ; i++)
			if(i % 2 == 0)
				even += i;
			else
				odd += i;
		System.out.println("짝수 : " + even);
		System.out.println("홀수 : " + odd);
	}

}
