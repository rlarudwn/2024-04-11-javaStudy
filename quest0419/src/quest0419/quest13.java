package quest0419;

public class quest13 {

	public static void main(String[] args) {
		/*int[] num = new int[6];
		for(int i = 0 ; i <= 5 ; i++) {
			num[i] = (int)(Math.random()*45)+1;
			System.out.println(num[i]);
		}*/
		/*for(int i = 1 ; i <= 100 ; i++)
			if(i % 11 == 0)
				System.out.println(i);*/
		/*int num_7 = 0;
		int num_9 = 0;
		for(int i = 1 ; i <= 100 ; i++) {
			if(i % 7 == 0)
				num_7 += i;
			if(i % 9 == 0)
				num_9 += i;
		}
		System.out.println(num_7);
		System.out.println(num_9);*/
		int cnt_3 = 0;
		int cnt_5 = 0;
		for(int i = 1 ; i <= 10 ; i++) {
			int num = (int)(Math.random() * 100) + 1;
			System.out.println(num);
			if(num % 3 == 0)
				cnt_3++;
			if(num % 5 == 0)
				cnt_5++;
		}
		System.out.println(cnt_3);
		System.out.println(cnt_5);
		

	}

}
