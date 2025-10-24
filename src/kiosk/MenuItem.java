package kiosk;

import java.lang.reflect.Array;
import java.util.List;

public class MenuItem {
    //속성

    //필드 생성 (이름, 가격, 음식소개)
    public String name;
    public int bPrice;
    public String bIntro;

    //생성자
    // 규칙
    //클래스와 이름이 같다.
    //반환 데이터 타입이 없다.
    // 여러 개가 존재할 수 있다.

    MenuItem(String name, int bPrice, String bIntro) {
        this.name = name;
        this.bPrice = bPrice;
        this.bIntro = bIntro;
    }

    //기능

    public String getName() {
        return  name;
    }
    public int getBPrice() {
        return bPrice;
    }
    public  String getBIntro() {
        return  bIntro;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "burger='" + name + '\'' +
                ", bPrice='" + bPrice + '\'' +
                ", bIntro='" + bIntro + '\'' +
                '}';
    }

}

// 변수에 담아라
//반복할 때 반복문 써라
// 조회할 때는 메소드 getter를 사용해라
