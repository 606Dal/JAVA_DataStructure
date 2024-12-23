package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Collection09 {

    public static void main(String[] args) {

        /*
         * 컬렉션 프레임워크 - HashMap
         * 
         * Map 인터페이스를 구현한 대표적인 클래스들
         *      HashMap
         *      TreeMap
         * 
         * Map 특징
         * - 한 개의 요소를 <key, value> 쌍으로 묶어서 관리하는 자료구조 형태
         * - 키(중복 X), 값(중복 O), 순서 X
         * - 객체 생성 때 -> 제네릭 타입을 지정하는 부분에서 키, 값 쌍에 대한 타입을 지정
         * 
         * ex) [아이디 : 비밀번호], [학생번호 : 학생아이디]
         * 
         * 주요 메서드
         *      put(K key, V value)   // <key, value> 쌍을 hashMap에 추가
         *      get(Object key)       // 키에 해당하는 값을 반환
         *      remove(Object key)    // 키에 해당하는 데이터를 삭제
         *      clear()
         *      size()
         *      keySet()    // 키들의 집합을 반환
         *      entrySet()  // 모든 엔트리를 반환(키랑 값 모두)
         */

        // HashMap 객체 생성
        HashMap<String, String> map = new HashMap<>();

        // 요소 추가
        map.put("superman", "su1234");
        map.put("batman", "ba5678");
        map.put("antman", "an9012");
        map.put("Wonderwoman", "won3456");
        map.put("ironman", "ir7890");

        // 키만 추출
        Set<String> ks = map.keySet();
        System.out.println();
        System.out.println(ks);

        // 한 개 요소만 키 지정해서 가져오기 -> Object 타입으로 받아서 가져오기 때문에 강제 형변환 필요
        //String val = (String) map.get("Wonderwoman");
        //System.out.println("Wonderwoman의 값 : " + val);
        System.out.println("Wonderwoman의 값 : " + map.get("Wonderwoman"));
            // W3s에서 예시. Java에서는 모든 참조 타입이 Object의 하위 클래스로 취급되므로 자동으로 타입 변환이 이루어집니다(phind에 형변환 필요 없는 이유 물어봄).

        // 반복문으로 entrySet() 출력
        System.out.println();
        for( Map.Entry<String,String> en : map.entrySet() ) {
            String key = en.getKey();
            String val = en.getValue();
            System.out.println( key + " : " + val);
        }

        System.out.println("======= 간단 출력 =======");
        System.out.println(map.entrySet());

        
    }
    
}

