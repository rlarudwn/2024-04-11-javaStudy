package chapter_04_2;

import javax.swing.*;
public class 문자열_04 extends JFrame {
	JTextField tf = new JTextField();
	public 문자열_04() {
		add("North", tf);
		tf.setText(String.valueOf(1000));
		setSize(350, 300);
		setVisible(true);
	}
	public static void main(String[] args) {

	}
}
