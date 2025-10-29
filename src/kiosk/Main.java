package kiosk;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //키오스크 기능
        // 1. 입력
        // 2. 각 메뉴관리 : 메인 음식, 사이드 음식, 음료
        // 3. 전체 메뉴
        //인터페이스: 콘솔
        //예외처리: 입력값으로 허용한 값 이외의 값이 입력되었을 때와 같은 오류 처리 고민

        //Menu 객체 생성을 통해 이름 설정
        //Menu 클래스 내 있는 List<MenuItem> 에 MenuItem 객체 생성하면서 삽입
        List<MenuItem> burgerList = new ArrayList<>();
        List<MenuItem> drinkList = new ArrayList<>();
        List<MenuItem> desertList = new ArrayList<>();

        //객체 생성 (인스턴스화)
        Menu burgerMenu = new Menu("Burgers", burgerList);
        burgerList.add(new MenuItem("ShackBurger", 6900, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerList.add(new MenuItem("SmokeBurger", 8900, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerList.add(new MenuItem("cheeseBurger", 6900, "포테이토 번과 비프패티, 치즈 토핑된 치즈버거"));
        burgerList.add(new MenuItem("HamBurger", 5400, "비프패티를 기반으로 야패가 들어간 기본버거"));

        Menu drinkMenu = new Menu("Drinks", drinkList);
        drinkList.add(new MenuItem("Protein", 4000, "단백질 함량이 30g 들어간 초코맛 프로틴"));
        drinkList.add(new MenuItem("Milk", 2000, "고소한 맛의 흰 우유"));
        drinkList.add(new MenuItem("CokeZero", 2000, "제로 칼로리이며, 부담 없는 햄버거와 잘 어울리는 최고의 조합"));
        drinkList.add(new MenuItem("Coke", 2000, "오리지널 콜라를 즐길 수 있는 환상의 조합"));

        Menu desertsrMenu = new Menu("Deserts", desertList);
        desertList.add(new MenuItem("Protein bread", 3000, "다이어터에게 적합한 빵"));
        desertList.add(new MenuItem("Nonegg Bread", 2000, "계란 알러지 있어도 먹을 수 있는 빵"));
        desertList.add(new MenuItem("Protein Cookie", 2000, "제로 콜라와 환상인 제로 당 쿠키"));
        desertList.add(new MenuItem("Original Cookie", 4000, "전통이 함께하는 오리지널 쿠키"));

        // List에 카테고리 추가하기
        List<Menu> menus = new ArrayList<>();
        menus.add(burgerMenu);
        menus.add(drinkMenu);
        menus.add(desertsrMenu);

        // Kiosk 객체 생성
        Kiosk kiosk = new Kiosk(menus); // 태현 튜터님과 한 부분
        // Kiosk 객체 생성
        kiosk.start(); // 태현 튜터님과 한 부분
    }
}
