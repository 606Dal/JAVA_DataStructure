package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Collection01 {

    public static void main(String[] args) {

        /*
         * 컬렉션 프레임워크 - 배열리스트(ArrayList)
         * - 배열과 비슷하지만 더 좋음. 배열과 유사한 특징을 가지는데 List가 내부적으로 배열을 이용하기 때문.
         * - 가장 큰 차이점 : 길이가 가변적.
         * - List는 인터페이스이기 때문에 객체를 생성할 수 없음 -> 이를 구현한 구현제 (ArratList)를 통해서 객체를 생성하고 사용.
         * 
         * 주요 메서드
         * - 추가 : add()
         * - 삭제 : remove()
         * - 길이 : size()
         * - 수정 : set()
         * - 출력 : get()
         * - 정렬 : Collections.sort( 컬렉션 명 )  // 오름차순
         * 
         */

        // ArrayList 기본 사용법
        ArrayList<Integer> list = new ArrayList<>();

        // 추가
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        // 사이즈 출력
        System.out.println( "============================" );
        System.out.println( list.size() );
        System.out.println();

        // 전체 출력
        /*
        for ( int i=0; i<list.size(); i++ ){
           System.out.println( list.get(i) );
        }*/
        for (int i : list )
            System.out.println( i );

        System.out.println( "============================" );

        // 삭제
        list.remove( 4 );
        System.out.println( list.size() );
        System.out.println();

        // 수정
        list.set(1, 20);
        for (int i : list )
            System.out.println( i );
        
        System.out.println("=============정렬=============");

        // 정렬
        //Collections.sort( list );
        Collections.sort( list, Collections.reverseOrder() ); // 내림차순
        for (int i : list )
            System.out.println( i );
        System.out.println();
    }

}
