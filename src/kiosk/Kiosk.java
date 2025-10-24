package kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // MenuItem 관리하는 리스트
   //1. 필드 선언
    private List<MenuItem> menuItemList;


    //[1] 속성

    //[2] 생성자
    Kiosk(List<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    //객체 생성 (인스턴스화)
    //[3] 기능

    //2. start() 사용
    public void start() {
        Scanner ksc = new Scanner(System.in);

        // (2-1)메뉴판
        System.out.println("[ SHAKESHACK MENU ]");
        //(1)반복문
        for (int i = 0; i < menuItemList.size(); i++){
           //(2) 메뉴 아이템 리스트 0번 인덱스 선정
            MenuItem menuItem = menuItemList.get(i);
            //(3) 메뉴 아이템 속성 게터한 부분 불러오기
           String name = menuItem.getName();
           int bPrice = menuItem.getBPrice();
           String bIntro = menuItem.getBIntro();
           //(4) 출력
            System.out.println(name + bPrice + bIntro);
        }
        //3. 입력
        System.out.println("주문할 햄버거를 입력하세요: ");
        int forder = ksc.nextInt();
            // 키오스크에서 주문하기
            switch (forder) {
                case 1:
                    System.out.println("1." + menuItemList.get(0));
                    break;
                case 2:
                    System.out.println("2." + menuItemList.get(1));
                    break;
                case 3:
                    System.out.println("3." + menuItemList.get(2));
                    break;
                case 4:
                    System.out.println("4." + menuItemList.get(3));
                    break;
                case 0:
                    System.out.println("0. 종료 | 종료");
                    break;
                default:
                    System.out.println("주문이 취소됐습니다.");
            }

    }
}
