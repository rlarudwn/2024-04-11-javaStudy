package chapter03_while_1;

import java.util.*;
import java.io.*;
public class 자바제어문_반복문_07 {

	public static void main(String[] args) throws Exception{
		FileReader fReader = new FileReader("c:\\javaDev\\movie.txt");
		int i = 0;
		while((i = fReader.read()) != -1) {
			System.out.print((char)i);
		}
	}

}
