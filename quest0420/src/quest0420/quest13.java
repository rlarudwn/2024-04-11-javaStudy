package quest0420;

public class quest13 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0 ; i < 10 ; i++) {
			int num = (int)(Math.random()*10)+1; 
			System.out.print(num + " ");
			sum += num;
		}

		System.out.println();
		
		System.out.println("총 합 : " + sum);
		System.out.println("평균 : " + (sum / 10.0));
		
	}

}
