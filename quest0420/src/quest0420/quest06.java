package quest0420;

public class quest06 {

	public static void main(String[] args) {
		int cnt = 0;
		int sum = 0;
		for(int i = 100 ; i <= 999 ; i++) 
			if(i % 4 != 0) {
				cnt++;
				sum += i;
			}
		System.out.println("갯수 : " + cnt);
		System.out.println("합 : " + sum);

	}

}
