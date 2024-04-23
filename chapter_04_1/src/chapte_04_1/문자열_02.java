package chapte_04_1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 문자열_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String alpha = JOptionPane.showInputDialog("알파벳 입력");
		int cnt = 0;
		for(int i = 0 ; i < alpha.length() ; i++) {
			char c = alpha.charAt(i);
			if(c == 'A' || c == 'a')
				cnt++;
		}

		JOptionPane.showMessageDialog(null, alpha + "에서 a나 A의 갯수는 : " + cnt);
		
	}

}
