package quest0419;

public class quest05 {

	public static void main(String[] args) {
		for(int i = 1 ; i <= 6 ; i++)
			for(int j = 1 ; j <= 6 ; j++)
				if(i + j == 6)
					System.out.printf("첫번째 주사위 : %d 두번째 주사위 : %d\n", i, j);
	}

}
