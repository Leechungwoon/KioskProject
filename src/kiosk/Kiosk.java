package kiosk;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    //TODO 속성
    //1. 필드 선언
    private List<Menu> menusK;
    //2. Scanner 선언
    Scanner koSc = new Scanner(System.in);

    //TODO 생성자 -> Kiosk를 통해 List<MenuItem> menuItem 값을 받음
    Kiosk(List<Menu> menusK) { //Kiosk = 클래스 이름과 같기에 생성자, 객체 생성 시 한 번만 실행됨
        this.menusK = menusK; // 외부에서 받은 리스트 저장
    }

    //TODO 기능
    //start()
    public void start() {

        while (true) {
            //반복문 시작 - 음식 주문하기
            //Menu가 가진 List<MenuItem>을 반복문을 활용하여 햄버거 메뉴 출력
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < menusK.size(); i++) {
                Menu menuA = menusK.get(i); //List<Menu>의 변수인 menusK에 담아서 printMenu 메서드를 호출
                System.out.println((i + 1) + "." + menuA.getCategory()); // i = 0으로 시작하여 + 1을 더함
            }
            System.out.print("목차를 선택하세요: ");

            // 프로그램 종료
            int input = koSc.nextInt(); //정수 받는 스캐너 담을 input 변수 선언

            if (input == 0) {
                System.out.println("0. 종료 | 종료");
                break;
            } else {
                System.out.print("주문 페이지로 넘어갑니다" + '\n');
            }
            System.out.println();// 한줄 띄기

            Menu menuB = menusK.get(input - 1); // 반환 값을 처리하기 개인 기준  (1부터 버거를 정했기 때문)
            List<MenuItem> menuItems = menuB.getMenuItems();
            // 상위 메뉴 주문
            // 입력 받은 숫자가 올바르다면 인덱스로 활용하여 List에 접근하기
            // 메뉴 출력
            //menuItems -> 안에있는 get을 가져올 수 있도록 Menu에 List를 리턴하는(getter) 함수를 만들어 MenuItems -> Menu -> Kiosk 로 호출
            for (int i = 0; i < menuItems.size(); i++) {
                kiosk.MenuItem km = menuItems.get(i); // menuItems.get(i)를 변수km에 담음
                System.out.println((i + 1) + "." + km.getName() + " | " + km.getPrice() + " | " + km.getIntro());
            }
            System.out.println();// 한줄 띄기

            System.out.println("메뉴를 선택해주세요: ");

            //input 받기 (주문)
            int input2 = koSc.nextInt();
            if (input2 == 0) {
                System.out.println("키오스크를 종료됐습니다.");
            } else if (input == 1) {
                System.out.println("주문한 메뉴: " + menuItems.get(0).getName() + " | " + menuItems.get(0).getPrice() + " ㅣ " + menuItems.get(0).getIntro());
            } else if (input == 2) {
                System.out.println("주문한 메뉴: " + menuItems.get(1).getName() + " | " + menuItems.get(1).getPrice() + " ㅣ " + menuItems.get(1).getIntro());
            } else if (input == 3) {
                System.out.println("주문한 메뉴: " + menuItems.get(2).getName() + " | " + menuItems.get(2).getPrice() + " ㅣ " + menuItems.get(2).getIntro());
            } else if (input == 4) {
                System.out.println("주문한 메뉴: " + menuItems.get(3).getName() + " | " + menuItems.get(3).getPrice() + " ㅣ " + menuItems.get(3).getIntro());
            } else {
                System.out.println("주문이 취소됐습니다.");
                break;
            }
        }
    }
}

