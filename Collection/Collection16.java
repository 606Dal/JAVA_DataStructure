package Collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Collection16 {

    public static void main(String[] args) {

        /*
         * TreeMap 클래스
         * 
         * ★ 기억하기
         *  - 맵은 기본적으로 키(Key)와 값(Value)의 쌍으로 구성
         *  - 일달 정렬이 된 상태로 맵이 구성 -> 키를 기준으로 정렬 (오름차순)
         *  - Key : Value 쌍을 어떻게 구성할지는 고민이 필요함.
         * 
         *  앞의 예제를 키 값 타입을 반대로 고쳐서 Treemap 복습
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

        System.out.println("[1]");
        //[1] 전체 출력
        System.out.println(map);

            // 2.map.entrySet()
        System.out.println("----------------------");
        for(Map.Entry<Integer,String> e : map.entrySet())
            System.out.println(e.getKey() + " = " + e.getValue());
        
            // 3. keySet()
        System.out.println("----------------------");
        for(Integer key : map.keySet())
            System.out.println(key + " : " + map.get(key));

        
        System.out.println("[2]");
        // [2]포도 가격이 얼마인지?
        // 직접 해보기
        for(Map.Entry<Integer,String> e : map.entrySet())
            if(e.getValue().equals("포도")){
                System.out.println("포도의 가격 : " + e.getKey());
            }
        
        // 강의 ( keySet() + get() 조합 / 또는 위에 처럼 entrySet() + getValue() 조합 )
        Set<Integer> keySet = map.keySet();

        Integer price = null;

        for(Integer k : keySet) {
            if( map.get(k).equals("체리") ) {
                price = k;
                break;
            }
        }
        System.out.println("체리의 가격 : " + price);
        // 값에 포도가 중복으로 있는 경우, 첫 번째 매칭된 요소를 출력


        System.out.println("[3]");
        // [3] 과일 중 가격이 가장 싼 과일은?
        System.out.println("가장 싼 과일의 가격 : " + map.firstKey());
        System.out.println("가장 작은 요소 : " + map.firstEntry());
        System.out.println("가장 비싼 과일의 가격 : " + map.lastKey());
        System.out.println("가장 큰 요소 : " + map.lastEntry());


        System.out.println("[4]");
        // [4] lowerEntry()
        Map.Entry<Integer, String> le = map.lowerEntry(3000);
        System.out.println(le); // 2000=포도
        Map.Entry<Integer, String> he = map.higherEntry(3000);
        System.out.println(he); // 4000=체리


        System.out.println("[5]");
        // [5] 가장 싼 과일의 이름은?
        System.out.println("가장 싼 과일 : " + map.firstEntry().getValue());
        
        
    }
    
}

