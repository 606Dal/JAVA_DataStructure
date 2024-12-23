public class Generic07 {

    public static void main(String[] args) {
        
        /*
         * 제네릭 메서드(Generic Method) 만들기 - 두 개의 값 중에서 작은 값 반환하기
         * T 타입의 변수에 비교 연산자를 사용해야 하는 것이 핵심 포인트
         * 
         */

        System.out.println("==================================");
        int i = MyDataCheck.min(100, 200);
        System.out.println(i);
         
        double d = MyDataCheck.min(3.14, 5.14);
        System.out.println(d);

        char c = MyDataCheck.min('a', 'A');
        System.out.println(c);     // A = 65, a = 97
        System.out.println( "a : " + (int)'a' );     //a = 97

        // String 데이터(문자열)를 보내도 제네릭 기반으로 만들었기 때문에 바로 사용이 가능
        // String 클래스는 Comparable 인터페이스를 구현했기 때문.
        String s = MyDataCheck.min("사", "랑");
        System.out.println( s ); // 랑
    }

    class MyDataCheck {
        public static <T extends Comparable<T>> T min( T x, T y) {
            return x.compareTo(y) < 0 ? x : y;
        }
    }


}

