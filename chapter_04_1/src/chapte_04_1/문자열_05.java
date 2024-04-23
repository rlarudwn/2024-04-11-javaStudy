// 오이:cucumber
// substring(int startIndex)
// substring(int startIndex, int endIndex)

package chapte_04_1;

public class 문자열_05 {

	public static void main(String[] args) {
		String f = "오이:cucumber";
		System.out.println("오이의 영어는?");
		System.out.println("영어는 " + f.substring(f.indexOf(':')+1));
		String msg = "Hello Java";
		System.out.println(msg.substring(0,7)+"...");

	}

}
