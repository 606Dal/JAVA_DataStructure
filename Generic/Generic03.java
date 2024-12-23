public class Generic03 {

    public static void main(String[] args) {
        /*
         * 제네릭 클래스의 매개변수 타입 제한하기
         * - 매개변수의 타입을 제한 할 수 있는데 이때는 ______ 관계를 이용해서 구현함.
         */

         DataLimit<Integer> dataInt = new DataLimit<>();
         dataInt.setFoo(77);
         System.out.println(dataInt.getFoo());
         System.out.println(dataInt);
         System.out.println();
         
         DataLimit<Double> dataDouble = new DataLimit<>();
         dataDouble.setFoo(3.14);
         System.out.println(dataDouble.getFoo());
         System.out.println(dataDouble);
         System.out.println();
       

    }

}

class DataLimit<T extends Number> {
    // Field
    private T foo;

    // Setter
    public void setFoo(T t){
        foo = t;
    }

    // Getter
    public T getFoo(){
        return foo;
    }

    public String toString() {
        return "타입 정보 출력 : " + foo.getClass().getName();
    }
}
