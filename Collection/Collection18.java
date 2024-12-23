package Collection;

import java.util.Map;
import java.util.TreeMap;

public class Collection18 {

    public static void main(String[] args) {

        /*
         * TreeMap - Comparable로 Person객체 정렬하기
         * - Comparable 인터페이스를 구현하지 않으면 TreeMap에 key로 지정하지 못함.
         * ㄴ Person 객체를 요소로 추가시 에러가 생김.
         * ㄴ 컴파일 단계에서는 오류가 안 나옴
         */

        // TreeMap 객체 생성
        TreeMap<UPerson, String> tmap = new TreeMap<>();
        tmap.put(new UPerson("홍길동", 40), "의적");
        tmap.put(new UPerson("강감찬", 20), "장군");
        tmap.put(new UPerson("이순신", 50), "영웅");

        System.out.println();
        for(Map.Entry<UPerson, String> e : tmap.entrySet())
            System.out.println(e.getKey().name + " / " + e.getKey().age + " : " + e.getValue());
    }
}

class UPerson implements Comparable<UPerson> {
    String name;
    int age;

    UPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(UPerson o) {
        // 이름으로 정렬
        //return this.name.compareTo(o.name);

        // 나이로 정렬
        return this.age - o.age;
    }

}



