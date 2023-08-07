package movie;

public class Movie {

	/*1. 프로젝트명 : 영화 예매 하기(MovieTicketProject)
	   패키지명 : movie
	2. 클래스명 : MovieMain.java -- main( )가 있는 경우(Movie.java--라이브러리클래스)
	3. 생성자 초기값 넣기로 자료를 넣어 주세요.    => 라이브클래스(Movie.java)
	     입력자료 : 영화명, 금액, 나이, 구매방법(현장, 인터넷, 쿠폰)
	  실구매금액조건 => switch ~ case
	        1) 나이가 20미만이면 25% 할인, 나이가 20~30이면 20%할인, 30이상이면 15%할인
	        2) 현장구매인 경우 0%할인, 인터넷 구매인 경우 추가 5%할인, 쿠폰구매인 경우 10%할인
	             예) 1째줄은 11000 * 70% = 7700
	                2째줄은 15000 * (100%-20%) = 12000
	                3째줄은 12500 * (100%-(15%+10%)) = 9375
	
	
	4. 입력자료    Scanner클래스를 main에 지정한다.   => MovieMain.java 에 넣는다.
	1째 레코드(줄) => 1917 11000 10 인터넷
	2째 레코드(줄)==> 주디 1500025 현장
	3째 레코드(줄)==> 인비저블맨 12500 40 쿠폰
	*/  
	
   String movieName;// 영화명
   int price;// 금액
   int age;// 나이
   int money;// 실구매금액
   double rate;// 할인율
   String way;// 구매방법

   // 생성자
   public Movie(String movieName, int price, int age, String way) {
      // 매개변수로 값을 받아서 멤버변수에 넣기
	  this.movieName = movieName;
      this.price = price;
      this.age = age;
      this.way = way;
   }

   public void rateCal() {
	   // if문으로 나이에 따라 할인율을 정한다.
      if (age < 20) {
    	  rate += 0.25; 
      }  else if (age >= 20 && age < 30) {
    	  rate += 0.20;
      } else if (age > 30) {
    	  rate+= 0.15;
      }
    	  // 스위치문으로 "인터넷"일떄 0.05 할인, "쿠폰"일떄 0.10 할인으로 지정했다.
    	 switch (way){
         case "인터넷":
             rate += 0.05;
             break; // break를 이용하여 더이상 계산이 내려가지 않는다.
          case "쿠폰":
             rate += 0.10;
             break; // break를 이용하여 더이상 계산이 내려가지 않는다.
          default:
             break;
       } 
    	 }
    	 
      // moneyCal 메서드를 만들고 위의 rateCal메서드에서 만든 함수를 불러와 실구매가격 money를 계산한다.
      public void moneyCal() {
          money = (int) (price - (price*rate));
       }

      // titlePrint 메서드에 제목을 프린트한다.
       public void titlePrint() {
          System.out.println("영화명\t\t금액\t\t나이\t\t실구매금액");
          System.out.println();
       }

 
       public void dataPrint() {
    	 // 위의 식을 아래에 적용시키기 위해 rateCal() moneyCal();을 가져온다.
    	   rateCal(); 
    	   moneyCal();
    	   // 내용 출력하기
          System.out.println(movieName + "\t\t" + price + "\t\t" + age + "\t\t" + money);
          System.out.println();
       }

   }

 