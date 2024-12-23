package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Collection02 {

    public static void main(String[] args) {

        /*
         * 컬렉션 프레임워크 - 배열리스트(ArrayList)
         * - String 타입의 예제를 만들어보시오.
         * 
         */

        // 객체 생성
        ArrayList<String> list = new ArrayList<>();

        // 컬렉션이 비어있는지 체크
        System.out.println( "==========================" );
        System.out.println( list.isEmpty() ); // true

        // 요소 추가
        list.add("홍길동");
        list.add("이순신");
        list.add("강감찬");
        list.add("을지문덕");
        list.add("장수왕");
        list.add("이순신");

        System.out.println( "==========================" );
        System.out.println( list.isEmpty() ); // false
        
        // 전체 출력
        System.out.println( "==========================" );
        for(String item : list)
            System.out.println(item);

        System.out.println(list);  // 배열 표시로 출력

        // 요소 수정
        list.set(2, "김유신");

        // 삭제
        list.remove(0);

        System.out.println( "==========================" );
        for(String item : list)
            System.out.println(item);
        System.out.println( "==========================" );
        
        // 특정 요소가 컬렉션에 포함되었는지 체크
        System.out.println("김유신 포함? : " + list.contains("김유신")); // 있으면 true
        
        // 특정 요소의 인덱스 반환
        System.out.println("김유신 위치? : " + list.indexOf("김유신")); // 1
        
        // 특정 요소가 여러 개 있을 때 그 중 마지막 인덱스를 반환
        System.out.println("이순신 요소의 마지막 인덱스? : " + list.lastIndexOf("이순신")); // 4

        // 특정 요소가 포함된 개수
        System.out.println("이순신 요소의 개수? : " + Collections.frequency(list, "이순신"));
        
        System.out.println( "==========================" );

        // 모두 삭제
        list.clear();
        System.out.println(list);
        

        
    }

}
