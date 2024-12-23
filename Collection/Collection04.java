package Collection;

import java.util.ArrayList;

public class Collection04 {

    public static void main(String[] args) {

        /*
         * 컬렉션 프레임워크 - 배열리스트(ArrayList)
         *      1. 원본 배열, 타켓 배열 두 리스트엣 서로 겹치는 요소에 대해서만 가져오기(교집합 구하기)
         *      2. 타겟 배열에서 원본 배열에 있는 값 삭제하기 (반복문 돌면서 특정 요소가 원본에 포함되어 있으면 삭제)
         * 
         */

        // 배열 리스트 객체 생성
        ArrayList<String> wonbon = new ArrayList<>();
        ArrayList<String> target = new ArrayList<>();

        // 원본 리스트에 추가
        wonbon.add("Superman");
        wonbon.add("Antman");
        wonbon.add("Batman");
        wonbon.add("Batman");
        wonbon.add("Antman");
        wonbon.add("antman");
        
        // 타겟 리스트에 추가
        target.add("Wonderwoman");
        target.add("Superman");
        target.add("Antman");
        target.add("Ironman");

        // 출력
        System.out.println("=========================");
        System.out.println(wonbon);
        System.out.println(target);
        System.out.println("=========================");
        
        // [1] 교집합 요소
        //wonbon.retainAll(target);
        //System.out.println(wonbon);
        //System.out.println("=========================");

        // [2] 타겟 리스트를 반복문으로 돌면서 요소가 원본에 포함되어 있으면 삭제
        for (int i = target.size()-1; i >= 0; i-- ) {
            if( wonbon.contains(target.get(i)) ) {
                target.remove(i);
            }
        }
        System.out.println( target );

        
    }

}
