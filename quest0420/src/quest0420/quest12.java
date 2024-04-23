package quest0420;

public class quest12 {

	public static void main(String[] args) {
		int min = 1000;
		int max = 0;
		for(int i = 1 ; i <= 5 ; i++) {
			int num = (int)(Math.random()*100)+1;
			if(num > max)
				max = num;
			if(num < min)
				min = num;
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}

}
