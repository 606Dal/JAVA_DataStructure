package Collection;

import java.util.ArrayList;

public class Collection03 {

    public static void main(String[] args) {

        /*
         * 컬렉션 프레임워크 - 배열리스트(ArrayList)
         * - 사용자 정의 객체 저장
         * 
         */
        // 배열 리스트 객체 생성
        ArrayList<CPerson> list = new ArrayList<>();

        // CPerson 객체 생성
        CPerson cp1 = new CPerson("Superman", 20);
        CPerson cp2 = new CPerson("Batman", 34);
        CPerson cp3 = new CPerson("Antman", 45);

        list.add(cp1);
        list.add(cp2);
        list.add(cp3);

        // System.out.printf("list.get(%d) => %s\n", 0, list.get(0));
        
        for(int i=0; i < list.size(); i++) {
            System.out.printf("list.get(%d) => %s\n", i, list.get(i));
        }
        System.out.println();
    
        
    }

}

class CPerson {
    private String name;
    private int age;
    
    public CPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return String.format("Person { name : %s, age : %d }", name, age);
    }

}
