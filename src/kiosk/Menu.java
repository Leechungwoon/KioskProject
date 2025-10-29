package kiosk;

import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner MenuSc = new Scanner(System.in);
    //속성
    // 1. MenuItem 클래스를 List로 관리
    private List<MenuItem> menuItems;
    private String category;

    // 생성자
    //2. 생성자
    Menu(String category, List<MenuItem> menuItems) {
        this.menuItems = menuItems;
        this.category = category;
    }
    //기능
    //카테고리 반환
    public String getCategory() {
        return category;
    }


    // 4. 음식 메뉴판

}

