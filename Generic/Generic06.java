public class Generic06 {

    public static void main(String[] args) {
        
        /*
         * 제약을 걸어 제네릭 메서드(Generic Method) 만들기
         * 
         */
        Generic06.showFirstChar("USA");
        //Generic06.<Integer>showFirstChar(12345); // 컴파일 단계에서 바로 에러 발견이 ㅇ
    }

    // 제네릭 메서드 만들기(1)
    /* public static void showFirstChar( String s ) {
        System.out.println( s.charAt(0) );
    }
    public static <T> void showFirstChar( T param ) {
        System.out.println( ((String) param).charAt(0) );
    }*/

    // 제네릭 메서드 만들기(2)
    public static <T extends CharSequence> void showFirstChar( T param ) {
        System.out.println( param.charAt(0) );
    }

}

