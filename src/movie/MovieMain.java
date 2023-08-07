package movie;

public class MovieMain {

		public static void main(String[] args) {
			// new를 사용하여 클래스를 객체화하고 Movie생성자에 값을 설정한다.
		      Movie m1 = new Movie("1917", 11000, 10, "인터넷");
		      Movie m2 = new Movie("주디", 15000, 25, "현장");
		      Movie m3 = new Movie("인비저블맨", 12500, 40, "쿠폰");
		      
		      // 제목, 최종결과 출력하기
		      m1.titlePrint();
		      m1.dataPrint();
		      m2.dataPrint();
		      m3.dataPrint();
		}
}
