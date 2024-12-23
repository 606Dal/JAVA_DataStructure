package Collection;

public class Collection10 {

    public static void main(String[] args) {

        /*
         * hashCode vs equals 메서드 재정의
         * 
         * - 해시코드 : 객체의 내용을 베이스로 만들어진 객체 구분(인식)용 정수 값 (= 식별자/주소 값)
         * - hashCode() 메서드 반환 타입 -> int
         * - equals() 메서드 : 조상 클래스인 Object 클래스의 메서드 -> == 연산자처럼 주소 비교
         * - == 연산자는 Primitive Type(원시타입)에 대해서는 값 비교가 가능, Reference Type(참조타입)에 대해서는 주소 비교를 수행
         * 
         * equals() 메서드를 통해서 동등 값 비교를 위해 -> String 클래스는  오버라이딩해서 사용(내부적으로 재 정의를 해놓은 상태라서 주소가 아니고 글자 비교가 가능함)
         * 
         * 
         */

        // Person 객체 생성
        TPerson p1 = new TPerson("Superman");
        TPerson p2 = new TPerson("Superman");
        //String p1 = new String("Superman");
        //String p2 = new String("Superman");
        //String p1 = "Superman";
        //String p2 = "Superman";

        // 객체 (참조) 변수 값 출력 -> 객체명.클래스명@16진수값(=해시코드의 정수값과 같음)
        System.out.println();
        //System.out.println( p1.toString() ); // Collection.TPerson@5acf9800
        //System.out.println( p2.toString() ); // Collection.TPerson@4617c264

        // hashCode 값 출력(int 타입)
        // 기본적으로 new 해서 생서시킨 객체들을 설령 같은 값으로 출력해도 서로 다른 객체임.
        System.out.println();
        //System.out.println( p1.hashCode() ); // 1523554304
        //System.out.println( p2.hashCode() ); // 1175962212

        // p1의 해시코드 값 => p1의 주소값으로 바꿔 줌
        //System.out.println( Integer.toHexString(1523554304) ); // 5acf9800
        //System.out.println( Integer.toHexString(p2.hashCode()) ); // 4617c264
        //System.out.println();


        // 주소 비교
        System.out.println("p1 == p2 결과 => " + (p1 == p2)); // false
        System.out.println("equals 결과 => " + p1.equals(p2)); // false(같은 값이어도)
    }
    
}

class TPerson {
    String name;

    public TPerson(String name) {
        this.name = name;
    }

    // equals 재정의
    @Override
    public boolean equals(Object obj) {
        return this.name.equals( ((TPerson) obj).name );
    }
    
}

