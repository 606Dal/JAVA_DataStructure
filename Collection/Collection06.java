package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collection06 {

    public static void main(String[] args) {

        /*
         * 정렬 비교 - 배열(Array) vs 배열리스트(ArrayList) 비교 및 Comparator 비교자로 정렬 적용
         * 배열(Array) : 전통적인 배열, 길이 고정
         * 배열리스트(ArrayList) : 컬렉션, 길이 가변적
         *
         */

        System.out.println();
        exam01();
        System.out.println("===============배열 정렬==============");

        System.out.println();
        exam02();
        System.out.println("===============배열리스트 정렬==============");

        System.out.println();
        exam03();
        System.out.println("===============문자열 길이로 정렬==============");

        
    }

    public static void exam01() {
        String animals[] = {
            "Tiger", "Lion", "Elephant", "Alligator", "111", "atom", "강감찬", "홍길동", " 공백"
        };
        // 오름차순 정렬 -> 숫자 >> 대문자 >> 소문자 >> 한글
        //Collections.sort( animals );
        Arrays.sort( animals );

        for( String animal : animals )
            System.out.println(animal);
            System.out.println();

        // 내림차순 정렬
        Arrays.sort( animals, Collections.reverseOrder() );
        for( String animal : animals )
            System.out.println(animal);
    }

    public static void exam02() {
        List<String> list = new ArrayList<>();

        list.add("111");
        list.add("aaa");
        list.add("강감찬");
        list.add(" 공백");
        list.add("BBB");
        list.add("강길동");

        // 오름차순 정렬
        Collections.sort(list);
        for(String s : list)
            System.out.println(s);
        System.out.println();

        // 내림차순
        Collections.sort(list, Collections.reverseOrder());
        for(String s : list)
            System.out.println(s);
    }

    public static void exam03() {
        String fruits[] = { "pear", "apple", "orange", "strawberry", "pineapple" };

        // 비교자(Comparator)를 만들어 문자열 길이로 정렬
        // 방법 1. Comparator<T> implements.
        /*
        class ComparatorLength implements Comparator<String> {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        }

        Comparator<String> cl = new ComparatorLength();
        Arrays.sort( fruits, cl);
        */
        
        // 방법 2. 람다식  - 형식 : (매개변수) -> 결괏값
        // 람다식은 간결하고 가동성 및 편리성이 뛰어나기 때문에 사용하는 경우가 많음.
        Comparator<String> cl = (s1, s2) -> s1.length() - s2.length();

        //Arrays.sort( fruits, cl );
        Arrays.sort( fruits, Collections.reverseOrder(cl) );

        for( String fruit : fruits )
            System.out.println(fruit);
    }
}


