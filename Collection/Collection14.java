package Collection;

import java.util.TreeSet;

public class Collection14 {

    public static void main(String[] args) {

        /*
         * TreeSet 컬렉션 - pollFirst(), pollLast()
         * 최솟값 / 최댓값 반환 후 그 값을 TreeSet 컬렉션에서 제거
         * 
         */

        int data[] = {4, 5, 3, 1, 2, 9, 7, 6, 8, 10, 4, 6, 2, 3, 8, 1, 7, 5, 2};

        // TreeSet 객체 생성
        TreeSet<Integer> ts = new TreeSet<>();

        for(int i=0; i < data.length; i++)
           ts.add(data[i]);
        
        System.out.println("=============================");
        System.out.println("ts 전체 출력 => " + ts); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        
        System.out.println("=============================");
        int a = ts.pollFirst();
        int b = ts.pollLast();
        
        System.out.println(a);
        System.out.println(b);
        System.out.println("ts 전체 출력 => " + ts); // [2, 3, 4, 5, 6, 7, 8, 9]

        System.out.println("=============================");
        System.out.println(ts.pollFirst());
        System.out.println(ts.pollLast());
        System.out.println("ts 전체 출력 => " + ts); // [3, 4, 5, 6, 7, 8]
        
        System.out.println("=============================");
        ts.clear();
        System.out.println(ts.pollFirst()); //null
        System.out.println(ts.pollLast()); //null
        System.out.println("ts 전체 출력 => " + ts); // []

        System.out.println();
        System.out.println("=============TreeSet<String>================");

        String data2[] = {"A", "B", "C", "D", "E", "F"};

        TreeSet<String> ts2 = new TreeSet<>();
        for(int i=0; i < data2.length; i++)
            ts2.add(data2[i]);
        
        System.out.println("ts2 전체출력 => " + ts2);
        
        String s1 = ts2.pollFirst();
        String s2 = ts2.pollLast();
        
        System.out.println(s1); // A
        System.out.println(s2); // F
        System.out.println("-----------------------------");
        System.out.println("ts2 전체출력 => " + ts2); // [B, C, D, E]
        
        System.out.println(ts2.first()); // B
        System.out.println(ts2.last());  // E
        System.out.println("ts2 전체출력 => " + ts2); // [B, C, D, E]
    }
    
}

