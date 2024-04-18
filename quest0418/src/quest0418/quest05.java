package quest0418;


public class quest05 {

	public static void main(String[] args) {
		
		/*for (char c = 'B' ; c <= 'N' ; c += 2)
			System.out.printf("%c\t", c);*/
		for (char c = 'B' ; c <= 'N' ; c += 2)
			if(c != 'N')
				System.out.printf("%c,",c);
			else
				System.out.printf("%c",c);

	}

}
