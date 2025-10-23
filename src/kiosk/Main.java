package kiosk;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //키오스크 기능
        // 1. 입력
        // 2. 각 메뉴관리 : 메인 음식, 사이드 음식, 음료
        // 3. 전체 메뉴
        //인터페이스: 콘솔
        //예외처리: 입력값으로 허용한 값 이외의 값이 입력되었을 때와 같은 오류 처리 고민

        //설명: 메뉴아이템이 본인을 가질 수 없다. -> 호출할 수 없다
        //메인에서 메뉴아이템을 호출해야하기에 list는 메인에 적고 접근제어자를 가질 수 없다.
        List<MenuItem> menuItem = new ArrayList<>();

        //1. Scanner 입력 생성
        Scanner sc = new Scanner(System.in);

        //객체 생성 (인스턴스화)
        MenuItem menuItem1 = new MenuItem("ShackBurger", "W 6.9", "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem menuItem2 = new MenuItem("SmokeBurger", "W 8.9", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem menuItem3 = new MenuItem("cheeseBurger", "W 6.9", "포테이토 번과 비프패티, 치즈 토핑된 치즈버거");
        MenuItem menuItem4 = new MenuItem("HamBurger", "W 5.4", "비프패티를 기반으로 야패가 들어간 기본버거");

        menuItem.add(menuItem1);
        menuItem.add(menuItem2);
        menuItem.add(menuItem3);
        menuItem.add(menuItem4);

            //2.  햄버거 메뉴판
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거\n" +
                    "2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거\n" +
                    "3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거\n" +
                    "4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거\n" +
                    "0. 종료      | 종료");

            // 3. 출력 메세지
            System.out.println("주문할 햄버거 숫자를 입력하세요: ");
            int foodOrder = sc.nextInt();

            // 4. 음식 선택 및 주문하기
            switch (foodOrder) {
                case 1:
                    System.out.println("1." + menuItem1);
                    break;
                case 2:
                    System.out.println("2." + menuItem2);
                    break;
                case 3:
                    System.out.println("3." + menuItem3);
                    break;
                case 4:
                    System.out.println("4." + menuItem4);
                    break;
                case 0:
                    System.out.println("0. 종료 | 종료");
                    break;
                default:
                    System.out.println("주문이 취소됐습니다.");
            }

    }
}