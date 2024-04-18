package chapter03_3;
/*
 * C:\windows\
	C:\Program Files\WindowsApps\Microsoft.Paint_11.2402.32.0_x64__8wekyb3d8bbwe\PaintApp
	C:\Program Files\WindowsApps\Microsoft.WindowsNotepad_11.2401.26.0_x64__8wekyb3d8bbwe\Notepad
	C:\ProgramData\Microsoft\Windows\Start Menu\Programs
	
 */
import java.util.Scanner;
import java.io.*;
public class 제어문_선택문_3 {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("메모장, 그림판, 크롬 >>");
		switch (scanner.next()){
		case "메모장" :
			Runtime.getRuntime().exec("C:\\Program Files\\WindowsApps\\Microsoft.WindowsNotepad_11.2401.26.0_x64__8wekyb3d8bbwe\\Notepad\\notepad.exe");
			break;
		case "그림판" : 			
			Runtime.getRuntime().exec("C:\\Program Files\\WindowsApps\\Microsoft.Paint_11.2402.32.0_x64__8wekyb3d8bbwe\\PaintApp\\mspaint.exe");
			break;
		case "크롬" : 			
			Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe http://naver.com");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
	}

}
