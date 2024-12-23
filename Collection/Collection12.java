package Collection;

import java.util.HashSet;
import java.util.Objects;

public class Collection12 {

    public static void main(String[] args) {

        /*
         * hashCode와 equals 메서드 재정의
         *      1. 두 객체의 해시코드 값 같게 만들기
         *      2. 2개 필드를 가지고 만들기.
         *      3. Objects 클래스의 hash() 메서드 사용.
         *       - 임의의 개수를 매개 값으로 받아 해시코드를 계산하여 반환해주는 정적 메서드
         *       - hashCode() 메서드를 오버라이딩하여 객체의 필드를 Objects.hash()의 인자로 넣어서 구현
         * 
         */

        // Person 객체 hashCode 값 출력
        Person p1 = new Person("홍길동", 20);
        Person p2 = new Person("홍길동", 30);

        System.out.println();
        System.out.println("p1 해시코드 : " + p1.hashCode());
        System.out.println("p2 해시코드 : " + p2.hashCode());

        System.out.println();
        System.out.println( "p1 == p2 해시코드 : " + (p1.hashCode() == p2.hashCode()) );
        System.out.println( "p1.equals(p2) 결과 : " + p1.equals(p2) );
        System.out.println();


        // HashSet 객체 생성
        HashSet<Person> set = new HashSet<>(); 
        
        set.add(new Person("슈퍼맨", 20));
        set.add(new Person("배트맨", 30));
        set.add(new Person("앤트맨", 40));
        
        for(Person p : set)
            System.out.println( p );
        System.out.println();
        
        set.add(p1);
        set.add(p2);
        // 중복된 객체 추가하기
        set.add(new Person("앤트맨", 40));

        for(Person p : set)
            System.out.println( p );
        System.out.println();

    }
    
}

class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{'" + this.name + "', " + this.age + "}";
    }

    @Override
    public int hashCode(){
        // [1] 방식 : String의 hashCode() 메서드 사용 방식
        //return name.hashCode() + age;

        // [2] 방식 : Objects.hash() 메서드 사용
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        // [1]
        /*
        if( obj instanceof Person ) {
            //Person p = (Person) obj;
            //return this.name.equals(p.name) && (this.age == p.age);
            return this.name.equals(((Person)obj).name) && (this.age == ((Person)obj).age);
        }
        else {
            return false;
        }
        */

        // [2]
        return ( obj instanceof Person ) ? this.name.equals(((Person)obj).name) && (this.age == ((Person)obj).age) : false;
    }
    
}
