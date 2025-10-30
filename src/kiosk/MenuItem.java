package kiosk;

public class MenuItem {
    //TODO 속성
    //1.필드 생성 (이름, 가격, 음식소개)
    private String name;
    private int Price;
    private String Intro;

    //TODO 생성자
    // 규칙
    //클래스와 이름이 같다.
    //반환 데이터 타입이 없다.
    // 여러 개가 존재할 수 있다.
    //2. 생성자 생성
    MenuItem(String name, int Price, String Intro) {
        this.name = name;
        this.Price = Price;
        this.Intro = Intro;
    }

    //TODO 기능
    //3. getter 조회
    public String getName() {
        return name;
    }
    public  int getPrice() {
        return Price;
    }
    public String getIntro() {
        return Intro;
    }

    //4. 주소 위치 -> 문자열로 출력
    @Override
    public String toString() {
        return "MenuItem{" + "burger='" + name + '\'' + ", bPrice='" + Price + '\'' + ", bIntro='" + Intro + '\'' + '}';
    }
}
