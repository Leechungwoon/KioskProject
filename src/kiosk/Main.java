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

        //2-3
        List<MenuItem> menuItemsList = new ArrayList<>();
        Kiosk kiosk = new Kiosk(menuItemsList);


        //1. Scanner 입력 생성
        Scanner sc = new Scanner(System.in);

        //객체 생성 (인스턴스화)
        menuItemsList.add(new MenuItem("ShackBurger", 6900, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItemsList.add(new MenuItem("SmokeBurger", 8900, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItemsList.add(new MenuItem("cheeseBurger", 6900, "포테이토 번과 비프패티, 치즈 토핑된 치즈버거"));
        menuItemsList.add(new MenuItem("HamBurger", 5400, "비프패티를 기반으로 야패가 들어간 기본버거"));

        kiosk.start();

    }
}