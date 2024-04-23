/*
		정수		int, long, byte
				=> Integer , Long, Byte	(클래스)
		실수		double
				=> Double
		문자		
		논리		boolean
				=> Boolean
		문자열	
 */
package chapte_04_1;

public class 문자열_06 {

	public static void main(String[] args) {
		String alpha = "ABCDEFGHIJ";
		//				0123456789
		System.out.println(alpha.substring(alpha.indexOf('C')));
		System.out.println(alpha.substring(alpha.indexOf('E'), alpha.indexOf('G') + 1));
		String id = " admin ";
		System.out.println(id + "의 문자 갯수 : " + id.length());
		id = id.trim();
		System.out.println(id.length());
		String msg = "Hello Java";
		System.out.println(msg.lastIndexOf('a'));		//경로명
		String ext = "Hello.Java";
		System.out.println(ext.substring(ext.lastIndexOf('.') + 1));
	}

}
