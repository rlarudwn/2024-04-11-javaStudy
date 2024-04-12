package chapter02;

public class 변수_3 {

	public static void main(String[] args) {
		
		int kor = 90;
		int eng = 80;
		int math = 75;
		int total = kor + eng + math;
		double avg = total / 3.0;
		System.out.println("국어점수 : "+kor);
		System.out.println("영어점수 : "+eng);
		System.out.println("수학점수 : "+math);
		System.out.println("총점 : "+ total);
		System.out.println("평균 : "+ avg);
		System.out.printf("평균 : %.2f", avg);
		
		
	}

}
