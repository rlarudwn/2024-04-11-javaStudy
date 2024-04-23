package quest0420;

public class quest05 {

	public static void main(String[] args) {
		int cnt = 0;
		int sum = 0;
		for(int i = 100 ; i <= 999 ; i++)
			if(i % 7 == 0) {
				cnt++;
				sum += i;
			}
		System.out.println("7의배수 개수 : " + cnt);
		System.out.println("7의배수 합 : " + sum);
		
	}

}
