package Collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Collection15 {

    public static void main(String[] args) {

        /*
         * TreeMap 클래스
         * 
         * ★ 기억하기
         *  - 맵은 기본적으로 키(Key)와 값(Value)의 쌍으로 구성
         *  - 일달 정렬이 된 상태로 맵이 구성 -> 키를 기준으로 정렬 (오름차순)
         *  - Key : Value 쌍을 어떻게 구성할지는 고민이 필요함.
         * 
         */

        // TreeMap 객체 생성 + 초깃값 설정(요소 추가)
        TreeMap<String, Integer> map = new TreeMap<>(){{
            put("참외", 1000);
            put("포도", 2000);
            put("사과", 3000);
            put("체리", 4000);
            put("수박", 5000);
        }};

        System.out.println();
        // [1] 전체 출력 1
        System.out.println(map);

        // ★ 2. 향상된 for문 사용 - Map.Entry = 키랑 값으로 이루어진 객체 하나하나로 보면 됨
        for(Map.Entry<String, Integer> e : map.entrySet()){
            // System.out.println(e);
            System.out.println( e.getKey() + ":" + e.getValue());
        }
        System.out.println();

        // ★ 3. 향상된 for문 -> map.ketSet() 사용 = 키만 가져옴
        for(String key : map.keySet())
            // System.out.print(key + " ");
            System.out.println(key + " : " + map.get(key));

        // [2] 하나만 출력 -> 포도 가격은?
        System.out.println( "포도의 가격은? " + map.get("포도") );

        // [3] 과일 중 가격이 가장 싼 과일은? << 결국 이게 아니잖...?
        // firstKey(), firstEntry() -> 키를 기준으로 한 최솟값을 가져옴.
        System.out.println(map.firstKey());     // 사과
        System.out.println(map.firstEntry());   // 사과=3000
        System.out.println(map.lastKey());      // 포도
        System.out.println(map.lastEntry());    // 포도=2000

        System.out.println("----------------------------");
        
        // [4] 요소 수정 = put
        map.put("포도", 2200);  // 키, 수정할 값
        
        Integer price = map.get("수박");
        price = 5500;
        map.put("수박", price);
        
        System.out.println(map);
        
        // [5] 메서드 반환 값 받기
        System.out.println("----------------------------");
        
        // 1. 첫 번째 요소 출력
        Map.Entry<String, Integer> entry = map.firstEntry();
        Integer minEntry = entry.getValue();
        System.out.println("트리맵 첫 번째 요소의 값 : " + minEntry);
        
        // 2. 마지막 요소 출력
        Map.Entry<String, Integer> entry2 = map.lastEntry();
        Integer maxEntry = entry2.getValue();
        System.out.println("트리맵 마지막 번째 요소의 값 : " + maxEntry);
        
        // 3. 반복문 사용해서 전체 출력. 변수 사용해서 entrySet()
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        
        for(Entry<String, Integer> en : entrySet)
        System.out.println(en);
        
        // 4. 트리맵 키들만 출력
        Set<String> keySet = map.keySet();
        for( String s : keySet)
        System.out.print(s + " ");
        System.out.println();
        
        System.out.println();
        System.out.println("----------------------------");
        
        // [6] lowerEntry() 메서드 사용하기. -> 지정된 키보다 작은 것 중 가장 큰 키를 찾을 수 있음. <-> higherEntry()
        Entry<String, Integer> entry3 = map.lowerEntry("참외");
        Entry<String, Integer> entry4 = map.higherEntry("참외");
        System.out.println("map.lowerEntry => " + entry3);
        System.out.println("map.higherEntry => " + entry4);
        
        int priceA = map.lowerEntry("포도").getValue();
        System.out.println(priceA);
        
        System.out.println();
        System.out.println("----------------------------");

        // [7] 가격이 가장 비싼 과일의 이름이 알고 싶다면?
        Entry<String, Integer> maxEntry2 = null;

        for ( Map.Entry<String,Integer> e : map.entrySet() ) {
            System.out.println(e);
            // 과일 금액 대소 비교
            if( maxEntry2 == null || e.getValue() > maxEntry2.getValue() ){
                maxEntry2 = e;
            }
        }
        System.out.println("가장 비싼 과일의 이름은? : " + maxEntry2.getKey());
        
    }
    
}

