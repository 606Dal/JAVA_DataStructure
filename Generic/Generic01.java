public class Generic01 {

    public static void main(String[] args) {
        /*
         * 제네릭 실습
         * - 정수형 값 또는 문자열 값을 전달하여 객체를 생성하고, 해당 타입의 정보를 출력하는 클래스를 만들어보시오.
         */
        //Integer foo = 100;

        //Data d1 = new Data( "대한민국" );

        //String a = (String) d1.getObj();
        //System.out.println(a);
        //System.out.println(d1.getObj());
        
        //Data<Integer> d1 = new Data<>(100);
        Data<String> d1 = new Data<>("글자");
        System.out.println(d1.getObj());
        d1.PrintInfo(); // 타입 정보 출력
    }

}

class Data<T> {
    // Field
    T obj;

    // Constructor(생성자)
    Data(T obj) {this.obj = obj;}

    // Getter Method
    T getObj() {return obj;}

    // PrintInfo Method
    void PrintInfo() {
        System.out.println("타입 출력 => " + obj.getClass().getName());
    }
}
/*
class Data {
    // Field
    //int obj;
    Object obj;

    // Constructor(생성자)
    //Data(int obj) {this.obj = obj;}
    Data(Object obj) {this.obj = obj;}

    // Getter Mwthod
    //int getObj() {return obj;}
    Object getObj() {return obj;}

    // PrintInfo Method
    // void PrintInfo( Integer obj ) {
    //     System.out.println("타입 출력 => " +obj.getClass().getName());
    // }
    void PrintInfo( Object obj ) {
        System.out.println("타입 출력 => " +obj.getClass().getName());
    }
}

class Data2 {
    String obj;
    Data2(String obj) {this.obj = obj;}
    String getObj() {return obj;}

    void PrintInfo( String obj ) {
        System.out.println("타입 출력2 => " +obj.getClass().getName());
    }
}
*/