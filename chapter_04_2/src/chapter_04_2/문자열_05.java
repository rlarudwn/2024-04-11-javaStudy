//https://www.genie.co.kr/newest/song?GenreCode=hot&pg=2
package chapter_04_2;

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 문자열_05 {
	static String[] LIST = {"hot", "L000", "L010", "L020", "L030", "L0107", "L050", "L060", "E000"};
	public static void MusicPrint(int menu, int last) throws Exception {
		int i = 1;
		while(true) {
			Document doc = Jsoup.connect("https://www.genie.co.kr/newest/song?GenreCode="+LIST[menu-1] + "&pg="+i).get();
			Elements title = doc.select("table.list-wrap a.title");
			Elements singer = doc.select("table.list-wrap a.artist");
			for(int j = 0 ; j < title.size() ; j++) {
				System.out.println((i-1)*30+j+1 + ". " +title.get(j).text() +" / 가수 : " + singer.get(j).text());
				if(((i-1)*30+j+1) == last)
					System.exit(0);
			}
			i++;
		}
	}
	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		System.out.print("몇위까지? : ");
		int last = scanner.nextInt();
		System.out.print("장르는 > 1. HOT 2. 전체 3. 가요 4. OST 5. 트롯 6. JAZZ 7. CLASSIC 8. EDM 9. 동요 /태교");
		int menu = scanner.nextInt();
		MusicPrint(menu, last);

	}

}


