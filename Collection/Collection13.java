package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Collection13 {

    public static void main(String[] args) {

        /*
         * TreeSet (중요한 3개는 기억)
         * 
         * 1. Set인터페이스를 구현한 대표 클래스(구현체)
         * -> Set의 특성인 ‘순서가 없는 데이터 집합’, ‘중복 X’을 가지고 있겠구나 생각.
         * 
         * 2. 이진 탐색 트리(BST)를 기반으로 구현된 컬렉션.
         *   TreeSet은 이런 특별한 자료 저장 구조를 사용하여 중복되지 않는 값을 자동 정렬된 상태로 저장.
         * (이진 트리 -> 부모 노드보다 큰 값은 오른쪽에 저장됨. 작으면 왼쪽.)
         * 
         * 3. 자동 정렬. 기본은 오름차순(Ascending)
         * (TreeMap 같은 경우 key를 기준으로 오름차순 정렬)
         * 
         */

        // 데이터 생성
        int data[] = {3, 9, 7, 1, 2, 5, 4, 10, 6, 8};

        System.out.println();
        // for(int i : data)
        //     System.out.print(i + " ");
        // System.out.println();

        TreeSet<Integer> ts = new TreeSet<>();

        // ts 자료구조에 데이터 저장
        for(int i=0; i < data.length; i++)
            ts.add(data[i]);

        // System.out.println("==========================");
        // System.out.println(ts); // 정렬된 상태로 출력 됨
        System.out.println("==========================");
        
        // 반복자 만들어서 출력하기 -> iterator()
        Iterator<Integer> iter = ts.iterator();
        
        while (iter.hasNext()) {
            System.out.print( iter.next() + " " );
        }
        System.out.println();
        
        // 순서없이 추가
        System.out.println("==========================");
        ts.add(13);
        ts.add(12);
        ts.add(11);
        System.out.println(ts); // 해도 정렬돼서 나옴.
        
        // 제거
        System.out.println("==========================");
        //System.out.println( ts.remove(10) );    // true
        //System.out.println( ts.remove(100) );   // 삭제할 게 없으면 false
        //System.out.println(ts);

        System.out.println(ts.contains(1)); // true
        System.out.println(ts.remove(5));   // true
        System.out.println(ts.isEmpty());     // false
        System.out.println(ts.size());        // 12
        System.out.println("최솟값 : " + ts.first());       // 1
        System.out.println("최댓값 : " + ts.last());        // 13
        System.out.println(ts);               // 5빼고 나옴
        
        System.out.println("==========================");
        System.out.println(ts.floor(7));    // 7
        System.out.println(ts.ceiling(7));  // 7

        System.out.println(ts.floor(5));    // 4
        System.out.println(ts.ceiling(5));  // 6
        
        System.out.println("higher : " + ts.higher(7));        // 8
        System.out.println("lower : " + ts.lower(7));        // 6

        System.out.println("==========================");
        System.out.println("subSet : " + ts.subSet(6, 10)); // 6, 7, 8, 9
        System.out.println("headSet : " + ts.headSet(4)); // 1, 2, 3
        System.out.println("tailSet : " + ts.tailSet(10)); // 10, 11, 12, 13
        
        // 매갯값에 따른 다른 결과 출력
        System.out.println("=========inclusive 추가=================");
        System.out.println("subSet : " + ts.subSet(6, false, 10, false)); // 7, 8, 9. 6과 10 두개 다 포함 안 함
        System.out.println("headSet : " + ts.headSet(4, true)); // 1, 2, 3, 4
        System.out.println("tailSet : " + ts.tailSet(10, false)); // 11, 12, 13
        System.out.println();
        
        // String 타입에 적용
        System.out.println("=========문자열=================");
        TreeSet<String> ts2 = new TreeSet<>();

        ts2.add("a");
        ts2.add("b");
        ts2.add("c");
        ts2.add("d");
        ts2.add("e");

        System.out.println("전체 출력 : " + ts2);
        System.out.println("최솟값 : " + ts2.first());
        System.out.println("최댓값 : " + ts2.last());
        System.out.println(ts2.subSet("a", "d")); // a, b, c
        System.out.println(ts2.subSet("a",false, "d", false)); // b, c
        System.out.println(ts2.headSet("c")); // a, b
        System.out.println(ts2.headSet("c",  true)); // a, b, c
        System.out.println(ts2.tailSet("c")); // c, d, e
        System.out.println(ts2.tailSet("c", false)); // d, e



    }
    
}

