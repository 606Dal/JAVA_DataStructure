package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Collection11 {

    public static void main(String[] args) {

        /*
         * equals 메서드 재정의 조금 더 생각해보기 -> 컬렉션 사용할 때
         * equals 재정의 해서 값 비교가 가능해도 저장되는 건 또 별개. 예를 들어 hashSet.
         * 이럴 때 hashCode도 재정의 해야 함.
         * 
         */

        // 객체 생성
        /*
        OPerson p1 = new OPerson("Wonderwoman");
        OPerson p2 = new OPerson("Wonderwoman");

        System.out.println();
        System.out.println("p1 == p2 결과? => " + (p1 == p2));
        System.out.println("p1.equals(p2) 결과? => " + p1.equals(p2));
        System.out.println();
        */

        // HashSet 객체 생성
        // [1] 스트링 사용 (equals + hashCode 까지 재정의 되어 있음)
        /*
        HashSet<String> set = new HashSet<>();

        String p1 = new String("Superman");
        String p2 = new String("Superman");

        // 요소 추가
        set.add(p1);
        set.add(p2);

        // 전체 개수
        System.out.println();
        System.out.println(set.size());
        */

        // [2]
        HashSet<OPerson> set = new HashSet<>();

        set.add(new OPerson("woman"));
        set.add(new OPerson("woman"));
        
        System.out.println();
        System.out.println(set);
        System.out.println(set.size());
        
        // 요소 찾기(검색)
        // get() 메서드 사용 X, contains() 메서드 사용.
        set.add(new OPerson("Batman"));
        set.add(new OPerson("Antman"));

        System.out.println();
        System.out.println( set.contains(new OPerson("Batman")) ); // true
        System.out.println();

        // 전체 요소 출력
        // [1] iterator() 사용
        Iterator<OPerson> iter = set.iterator();
        while (iter.hasNext()) {
            OPerson el = iter.next();
            System.out.println(el);
        }
        System.out.println("===============================");
        // [2] forEach() + 람다식 사용
        set.forEach( element -> System.out.println( element ) );
        System.out.println("===============================");
        
        // 이름의 길이가 5인 요소 찾기
        set.forEach( element -> {
            if( element.name.length() == 5 ) {
                System.out.println( "객체 이름의 길이가 5인 이름 : " + element ); 
            }
        });


    }
    
}

class OPerson {
    String name;

    public OPerson(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{'" + name + "'}";
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    // equals 재정의
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof OPerson) {
            OPerson o = (OPerson) obj;
            return name.equals(o.name);
            // return this.name.equals(((OPerson)obj).name);
        }
        else {
            return false;
        }
    }

}

