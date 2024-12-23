package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Collection08 {

    public static void main(String[] args) {

        /*
         * 컬렉션 프레임워크 - Hashset
         * 
         * Set 인터페이스를 구현한 대표적인 클래스들
         *      HashSet
         *      TreeSet
         * 
         * Set 특징
         * - 순서 X, 중복 X
         * - Set 인터페이스는 Collection 인터페이스를 상속받으므로, Collection에서 정의한 메서드 대부분을 사용
         * 
         * 주요 메서드
         *      add()
         *      remove()
         *      contains()
         *      size()
         *      isEmpty()
         *      clear()
         */

        // HashSet 객체 생성
        HashSet<String> set = new HashSet<>();

        // 요소 추가
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");

        // 출력
        System.out.println();
        System.out.println(set);

        // 제거
        set.remove("C");
        System.out.println( set );
        
        // 추가
        set.add("P");
        System.out.println( set ); // 순서에 상관없이 저장되므로 순서를 생각할 필요 없음.
        
        // 중복 값 추가
        System.out.println( "현재 사이즈 : " + set.size()); // 5
        set.add("A"); // 중복 X
        System.out.println("중복 추가 후 사이즈 : " + set.size()); // 5

        // 순서에 상관없이 저장하기 때문에 인덱스를 이용해 가져오지 못함
        // HashSet은 내부적으로 HashMap을 사용하여 데이터를 처리하기 때문에 중복을 없앨 수 있음.

        // contains() 메서드를 사용하여 값 포함 여부 체크
        System.out.println("Y가 포함? => " + set.contains("Y")); // false
        System.out.println("A가 포함? => " + set.contains("A")); // true
        System.out.println("a가 포함? => " + set.contains("a")); // false
        System.out.println();
        
        // 전체 출력 (2가지는 아는 게 좋음)
        // 향상된 for문 권장.
        for( String s : set )
            System.out.println(s);
        System.out.println();
        
        // set.iterator() 반복자 메서드 사용하는 방법도 알고 있는 게 좋음.
        System.out.println("===== 반복자 사용해서 출력 =====");
        Iterator<String> iter = set.iterator();
            // hasNext() 메서드를 사용하여 반복자에 다음 데이터가 있는지 체크. true / false
        while (iter.hasNext()) {
            System.out.println( iter.next() );
        }
    }
    
}

