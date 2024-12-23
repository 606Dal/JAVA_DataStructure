public class Generic02 {

    public static void main(String[] args) {
        /*
         * 매개변수를 여러 개 받는 제네릭 클래스 정의하기
         * - 매개변수로 String(사람 이름), Integer(나이) 2개를 받는 제네릭 클래스를 정의해보시오.
         */
        DataTwo<String, Integer> user = new DataTwo<>();
        user.set("홍길동", 20);
        user.PrintInfo();
        System.out.println(user);
        
        DataTwo<Double, String> user2 = new DataTwo<>();
        user2.set(75.5, "Batman");
        user2.PrintInfo();
        System.out.println(user2);
    }

}

class DataTwo<T1, T2> {
    // Field
    private T1 foo;
    private T2 bar;

    // Setter
    public void set(T1 t1, T2 t2) {
        foo = t1;
        bar = t2;
    }

    // PrintInfo Method
    public void PrintInfo() {
        System.out.println("T1 타입 정보 출력 : " + foo.getClass().getName());
        System.out.println("T2 타입 정보 출력 : " + bar.getClass().getName());
    }

    // toString()
    @Override
    public String toString() {
        return "DataTwo [foo=" + foo + ", bar=" + bar + "]";
    }
}
