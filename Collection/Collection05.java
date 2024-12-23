package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Collection05 {

    public static void main(String[] args) {

        /*
         * 컬렉션 프레임워크 - 배열리스트(ArrayList) : 사용자 정의 객체 정렬 ★★★
         *
         */

        // 배열 리스트 객체 생성
        ArrayList<EPerson> list = new ArrayList<>();

        // EPerson 객체 생성
        EPerson ep1 = new EPerson("A", 30);
        EPerson ep2 = new EPerson("B", 18);
        EPerson ep3 = new EPerson("C", 20);

        list.add(ep1);
        list.add(ep2);
        list.add(ep3);

        System.out.println();

        for( int i=0; i < list.size(); i++ ) {
            System.out.printf( "list.get(%d) => %s\n", i, list.get(i) );
        }
        System.out.println();
        
        Collections.sort(list); // 오름차순(Ascending)
        //Collections.sort(list, Collections.reverseOrder()); // 내림차순(Descending)
        
        for( EPerson person : list)
            System.out.println(person);

        System.out.println();
    }
}

class EPerson implements Comparable<EPerson> {

    // Field
    String name;
    int age;

    // Constructor
    public EPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public String toString() {
        return String.format("Person { name: %s, age: %d }", name, age);
    }

    /* 이 메서드는 두 개의 객체를 비교하여 한 객체가 다른 객체보다 크면 양수(1), 같으면 (0), 작으면 음수(-1)를 반환.
    - 음수를 반환하면 sort 메서드가 두 객체를 체인지 */
    @Override
    public int compareTo(EPerson other) {
        // 나이를 기준으로 정렬
        //return this.age - other.age; // 오름차순. 반대로 하면 내림차순
        //return other.age - this.age;
        //return (this.age - other.age) * (-1); // 이것도 가능. 내림차순.

        // age 값으로 정렬 -> if.. else 사용
        if( this.age < other.age ) return -1;
        else if ( this.age == other.age ) return 0;
        else return 1;

        // 이름을 기준으로 정렬
        // this 값은?
        /*char c1 = this.name.charAt(0);
        System.out.println("this.name = " + (int)c1); // 66(B)

        char c2 = other.name.charAt(0);
        System.out.println("other.name = " + c2); // A

        System.out.println();
        return this.name.compareTo(other.name); // 오름차순 (대소문자 같이 있으면 대문자 먼저)
        //return (this.name.compareTo(other.name)) * (-1); // 반환 값이 int라서 가능. 내림차순*/
    }
}
