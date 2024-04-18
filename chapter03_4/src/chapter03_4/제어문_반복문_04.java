/*
		반복문 제어
		continue	=> 특정부분 제외
		break		=> 반복문 중단
 */
package chapter03_4;

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 제어문_반복문_04 {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);
		System.out.print("제목 입력 : ");
		String date = scanner.next();

		int k = 1;
		int fcnt = 0;
		for(int i = 1 ; i <= 4 ; i++) {
			Document document = Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20240418&hh=14&rtm=Y&pg="+i).get();
			Elements title = document.select("table.list-wrap a.title");
			Elements singer = document.select("table.list-wrap a.artist");
			for(int j = 0 ; j < title.size() ; j++) {
				
				if(title.get(j).text().contains(date)) {
					System.out.println(k);
					System.out.println(title.get(j).text());
					System.out.println(singer.get(j).text());
					fcnt++;
				}
				k++;
			}
		}
		System.out.println("검색결과 " + fcnt + "건");

	}

}
