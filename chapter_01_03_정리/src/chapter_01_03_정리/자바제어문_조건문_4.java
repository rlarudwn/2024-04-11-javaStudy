package chapter_01_03_정리;

import java.util.Scanner;
import javax.swing.*;


public class 자바제어문_조건문_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String id = JOptionPane.showInputDialog("ID 입력 : ");
		String pwd = JOptionPane.showInputDialog("비밀번호 입력 : ");
		final String ID = "admin";
		final String PWD = "1234";
		if(id.equals(ID) && pwd.equals(PWD))
			JOptionPane.showMessageDialog(null, id + "님 로그인되었습니다!\n메인으로 이동합니다.");
		else
			JOptionPane.showMessageDialog(null, "아이디나 비밀번호가 틀렸습니다\n다시 입력하세요.");
		
	}

}
