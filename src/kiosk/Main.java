package kiosk;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //키오스크 기능
        // 1. 입력
        // 2. 각 메뉴관리 : 메인 음식, 사이드 음식, 음료
        // 3. 전체 메뉴
        //인터페이스: 콘솔
        //예외처리: 입력값으로 허용한 값 이외의 값이 입력되었을 때와 같은 오류 처리 고민

        //1. Scanner 입력 생성
        Scanner sc = new Scanner(System.in);

        //속성
        //2.  햄버거 메뉴판
        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거\n" +
                "2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거\n" +
                "3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거\n" +
                "4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거\n" +
                "0. 종료      | 종료");

        //3. Burger 생성
        String burger1 = "ShackBuger";
        String burger2 = "SmokeBuger";
        String burger3 = "CheeseBuger";
        String burger4 = "HamBuger";

        //4. 가격 설정
        String bPrice1 = "W 6.9";
        String bPrice2 = "W 8.9";
        String bPrice3 = "W 6.9";
        String bPrice4 = "W 5.4";

        //5. 메뉴 설명
        String bIntro1 = "토마토, 양상추, 쉑소스가 토핑된 치즈버거";
        String bIntro2 = "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거";
        String bIntro3 = "포테이토 번과 비프패티, 치즈 토핑된 치즈버거";
        String bIntro4 = "비프패티를 기반으로 야패가 들어간 기본버거";

        // 6. 출력 메세지
        System.out.println("주문할 햄버거 숫자를 입력하세요: ");
        int foodOrder = sc.nextInt();

        // 7. 음식 선택 및 주문하기
        switch (foodOrder){
            case 1 :
                System.out.println("1." + burger1 + "|" + bPrice1 + "|" + bIntro1);
                break;
            case 2 :
                System.out.println("2." + burger2 + "|" + bPrice2 + "|" + bIntro2);
            case 3 :
                System.out.println("3." + burger3 + "|" + bPrice3 + "|" + bIntro3);
            case 4 :
                System.out.println("4." + burger4 + "|" + bPrice4 + "|" + bIntro4);
            case 0 :
                System.out.println("0. 종료 | 종료");
        }

        //8. 주문 완료 문구
        System.out.println("주문이 완료됐습니다.");


    }
}
