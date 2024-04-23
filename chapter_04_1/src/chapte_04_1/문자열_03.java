package chapte_04_1;

public class 문자열_03 {

	public static void main(String[] args) {
		String msg = "Hello java";
		System.out.println(msg.replace(' ', '\t'));
		msg = "홍길동 hong gil dong";
		System.out.println(msg.replaceAll("[가-힇]", ""));
		System.out.println(msg.replaceAll("[a-zA	-Z]", ""));

	}

}
