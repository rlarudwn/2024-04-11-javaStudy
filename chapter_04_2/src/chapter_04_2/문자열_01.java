/*
		searchMainDailyBoxOffice.do	일일박스오피스
		searchMainRealTicket.do		실시간 예매율
		searchMainDailySeatTicket.do	좌석점유율순위
		{"startYearDate":"2024.04.22","endYearDate":"2024.04.22","startDate":"2024년 04월 22일(월)",
		"endDate":"2024년 04월 22일(월)","movieCd":"20234675","showDt":"20240422",
		"thumbUrl":"/common/mast/movie/2024/02/thumb/thn_febb838d186b46878ca5467759930333.jpg",
		"movieNm":"파묘","movieNmEn":"Exhuma",
		"synop":"미국 LA, 거액의 의뢰를 받은 무당 ‘화림’(김고은)과 ‘봉길’(이도현)은\r\n기이한 병이 대물림되는 집안의 장손을 만난다.\r\n조상의 묫자리가 화근임을 알아챈 ‘화림’은 이장을 권하고,\r\n돈 냄새를 맡은 최고의 풍수사 ‘상덕’(최민식)과 장의사 ‘영근’(유해진)이 합류한다.\r\n\r\n“전부 잘 알 거야… 묘 하나 잘못 건들면 어떻게 되는지”\r\n\r\n절대 사람이 묻힐 수 없는 악지에 자리한 기이한 묘.\r\n‘상덕’은 불길한 기운을 느끼고 제안을 거절하지만,\r\n‘화림’의 설득으로 결국 파묘가 시작되고…\r\n\r\n나와서는 안될 것이 나왔다.\r\n\r\n\r\n",
		"prdtYear":"2024","indieYn":null,"artmovieYn":null,"multmovieYn":null,"showTm":"133","showTs":"50",
		"director":"장재현","prNm":"(주)쇼박스,(주)엠씨엠씨","dtNm":"(주)쇼박스","repNationCd":"한국",
		"movieType":"장편","moviePrdtStat":"개봉","genre":"미스터리,공포(호러)",
		"watchGradeNm":"15세이상관람가","openDt":"20240222","salesAmt":129113849,
		"audiCnt":13532,"totalSalesAmt":114043582262,"totalAudiCnt":11798651,
		"scrCnt":940,"showCnt":2558,"rank":1,"rankInten":1,"rankOldAndNew":"OLD","rownum":1}
		
		{"startDate":"2024년 04월 22일(월)","endDate":"2024년 04월 22일(월)","totcnt":103,
		"watchGradeNm":"전체관람가","movieCd":"20236614","showDt":"20240422",
		"fileSaveLoct":"/common/mast/movie/2024/03/","orgnFileNm":"4dnjf.jpg",
		"sysFileNm":"e3e20bd1edf347aeb3ae835d6cc5351a.jpg","movieNm":"쿵푸팬더4",
		"movieNmEn":"Kung Fu Panda 4","openDt":"20240410","totSeatCntRatio":" 31.0","totSeatAmtRatio":" 2.6",
		"totSeatCnt":505090,"rank":1,"repNationCd":"미국","movieType":"장편","moviePrdtStat":"개봉",
		"genre":"애니메이션,액션,코미디","thumbUrl":"/common/mast/movie/2024/03/thumb/thn_e3e20bd1edf347aeb3ae835d6cc5351a.jpg",
		"showTm":"93","showTs":"31","prdtYear":"2024","indieYn":null,"artmovieYn":null,"multmovieYn":null,
		"director":"마이크 미첼,스테파니 스티네","prNm":null,"dtNm":"유니버설픽쳐스인터내셔널 코리아(유)","rankInten":0,
		"rankOldAndNew":"OLD","rownum":1}
 */
package chapter_04_2;

import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.*;

public class 문자열_01 {

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("=====================");
			System.out.println("1. 일일 박스오피스");
			System.out.println("2. 실시간 예매율");
			System.out.println("3. 좌석 점유율 순위");
			System.out.println("4. 프로그램 종료");
			System.out.println("=====================");
			System.out.print("메뉴 선택 : ");
			int menu = scanner.nextInt();
			if(menu == 1) {
				Document doc = Jsoup.connect("https://www.kobis.or.kr/kobis/business/main/searchMainDailyBoxOffice.do").get();
				String data = doc.toString();
				data = data.substring(data.indexOf('['), data.lastIndexOf(']') + 1);
				//System.out.println(data);
				JSONParser jp = new JSONParser();
				JSONArray arr = (JSONArray)jp.parse(data);
				for(int i = 0 ; i < arr.size() ; i++) {
					JSONObject obj = (JSONObject)arr.get(i);
					System.out.println((i+1) + "." + obj.get("movieNm"));
					System.out.println(obj.get("synop"));
					System.out.println();
				}
			}
			else if(menu == 2) {
				Document doc = Jsoup.connect("https://www.kobis.or.kr/kobis/business/main/searchMainRealTicket.do").get();
				String data = doc.toString();
				data = data.substring(data.indexOf('['), data.lastIndexOf(']') + 1);
				//System.out.println(data);
				JSONParser jp = new JSONParser();
				JSONArray arr = (JSONArray)jp.parse(data);
				for(int i = 0 ; i < arr.size() ; i++) {
					JSONObject obj = (JSONObject)arr.get(i);
					System.out.println((i+1) + "." + obj.get("movieNm")+"\n");
					System.out.println(obj.get("synop"));
					System.out.println();
				}
			}
			else if(menu == 3) {
				Document doc = Jsoup.connect("https://www.kobis.or.kr/kobis/business/main/searchMainDailySeatTicket.do").get();
				String data = doc.toString();
				data = data.substring(data.indexOf('['), data.lastIndexOf(']') + 1);
				//System.out.println(data);
				JSONParser jp = new JSONParser();
				JSONArray arr = (JSONArray)jp.parse(data);
				for(int i = 0 ; i < arr.size() ; i++) {
					JSONObject obj = (JSONObject)arr.get(i);
					System.out.println((i+1) + "." + obj.get("movieNm")+"\n");
					System.out.println(obj.get("genre"));
					System.out.println();
				}
				
			}
			else if(menu == 4) {
				System.out.println("프로그램 종료");
				break;
			}
			else
				System.out.println("존재하지 않는 메뉴입니다");
			
			
		}
	}

}
