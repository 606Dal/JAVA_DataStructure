package Collection;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Collection17 {

    public static void main(String[] args) {

        /*
         * TreeMap 클래스 - Comparator 내림차순 정렬하기
         * 
         */

        // TreeMap 객체 생성 + 초깃값 설정(요소 추가)
        TreeMap<Integer, String> map = new TreeMap<>(){{
            put(1000, "참외");
            put(2000, "포도");
            put(3000, "사과");
            put(4000, "체리");
            put(5000, "수박");
        }};

        System.out.println();
        System.out.println(map);
        System.out.println("-----------------------");
        
        // 내림차순으로 출력. TreeMap 객체를 생성할 때 구현한 FruitsComparator를 인자로 전달.
        TreeMap<Integer, String> tmap2 = new TreeMap<>(new FruitsComparator()) {{
            put(1000, "참외");
            put(2000, "포도");
            put(3000, "사과");
            put(4000, "체리");
            put(5000, "수박");
        }};
        
        for( Map.Entry<Integer, String> entryDesc : tmap2.entrySet() )
            System.out.println(entryDesc);
        
    }
}

// Comparator 인터페이스 구현
class FruitsComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        //return o2.intValue()-o1.intValue();
        return o2-o1;
    }
}

