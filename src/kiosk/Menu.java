package kiosk;

import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner MenuSc = new Scanner(System.in);
    //TODO 속성
    // 1. MenuItem 클래스를 List로 관리
    private List<MenuItem> menuItems;
    private String category;

    // TODO 생성자
    //2. 생성자
    Menu(String category, List<MenuItem> menuItems) {
        this.menuItems = menuItems;
        this.category = category;
    }
    //TODO 기능
    //카테고리 반환
    public String getCategory() {
        return category;
    }

    //3. List를 리턴하는 함수
    List<MenuItem> getMenuItems(){
        return  menuItems;
    }

    // 4. 음식 메뉴판
    void printMenu() {
            for (int i = 0; i < menuItems.size(); i++) { //menuItems의 배열 사이즈 만큼 최대값을 두고 출력한다.
                //MenuItem에서 get을 통해 이름, 가격, 내용을 불러옴
                System.out.println((i + 1) + "." + menuItems.get(i).getName() + "|" + menuItems.get(i).getPrice() + " | " + menuItems.get(i).getIntro());
            }
            System.out.println(" 메뉴 리스트로 돌아갑니다.");
            System.out.println("음식 카테고리 번호를 입력하세요");
            int input = MenuSc.nextInt(); // 정수넣는 스캐너 input선언
    }
}