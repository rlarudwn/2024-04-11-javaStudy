/*
		JDBC	=> DBCP	=> MyBatis	=> (JPA)
		Ajax	=> Vue	=> React	=> Redux	=> Reac
		
		https://www.genie.co.kr/chart/top200?ditc=D&ymd=20240423&hh=15&rtm=Y&pg=2
		
		jsoup			셀레니움
 */

package chapter_04_2;

import java.util.Scanner;

import javax.swing.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 문자열_02 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1. 노래명 검색   2. 가수명 검색");
		int menu = scanner.nextInt();

		if(menu == 1) {
			System.out.print("검색할 노래명 입력 : ");
			String fd = scanner.next();
			for(int i = 1 ; i <= 4 ; i++) {
				Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20240423&hh=15&rtm=Y&pg="+i).get();
				Elements title = doc.select("table.list-wrap a.title");
				Elements singer = doc.select("table.list-wrap a.artist");
				for(int j = 0 ; j < title.size() ; j++) {
					if(title.get(j).text().contains(fd))
						System.out.println((i-1)*50+(j+1) + ". " + title.get(j).text()
								+" ("+singer.get(j).text()+")"
								);
				}
			}
		}
		else if(menu == 2) {
			System.out.print("검색할 가수명 입력 : ");
			String fd = scanner.next();
			for(int i = 1 ; i <= 4 ; i++) {
				Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20240423&hh=15&rtm=Y&pg="+i).get();
				Elements title = doc.select("table.list-wrap a.title");
				Elements singer = doc.select("table.list-wrap a.artist");
				for(int j = 0 ; j < title.size() ; j++) {
					if(singer.get(j).text().contains(fd))
						System.out.println((i-1)*50+(j+1) + ". " + title.get(j).text()
								+" ("+singer.get(j).text()+")"
								);
				}
			}

		}

	}

}
