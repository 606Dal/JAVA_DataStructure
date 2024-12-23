import java.util.ArrayList;

public class GenericQuestion {

    public static void main(String[] args) {
        /*
         * 제네릭 실습
         * - 정수형 값 또는 문자열 값을 전달하여 객체를 생성하고, 해당 타입의 정보를 출력하는 클래스를 만들어보시오.
         */
        QData<Integer> d1 = new QData<>();
        d1.setFoo(707);
        System.out.println(d1.getFoo());
        d1.PtrintInfo();
        System.out.println("=========================");

         /*
         * 매개변수를 여러 개 받는 제네릭 클래스 정의하기
         * - 매개변수로 String(사람 이름), Integer(나이) 2개를 받는 제네릭 클래스를 정의해보시오.
         */

        QUser<String, Integer> user = new QUser<>();
        user.setQUser("하늘", 17);
        System.out.println("이름 : " + user.getFoo() + ", 나이 : " + user.getBar());
        System.out.println(user);
        System.out.println("=========================");

        /*
        * 제네릭 클래스의 매개변수 타입 제한하기
        * - 매개변수의 타입을 제한 할 수 있는데 이때는 ______ 관계를 이용해서 구현함.
        */
        QDataLimit<Double> qd = new QDataLimit<>();
        qd.setFoo(3.142);
        System.out.println(qd.getFoo());
        System.out.println(qd);
        System.out.println("=========================");

        /* 조류 객체만 담는 클래스를 만들어보시오.
         *      1. Birds 클래스를 추상 클래스로 만들고, 추상 메서드 cry() 메서드를 정의한다.
         *      2. Birds 클래스를 상속 받는 Eagle, (3.)Owl 자식 클래스를 만들고 cry() 메서드를 구체적으로 구현
         *      4. Dog 클래스를 만들고, Birds 클래스는 상속 받지 않는다.
         *      5. AnimalList 클래스를 제네릭으로 만들고, Eagle, Owl 객체를 ArrayList에 저장한다. */

        qAnimalList<qBirds> qbridsList = new qAnimalList<>();
        qbridsList.set(new qEagle());
        qbridsList.set(new qOwl());

        for( int i=0; i < qbridsList.sizeList(); i++ ){
            System.out.println( qbridsList.get(i) );
            qbridsList.get(i).cry();
        }

    }
}

class QData<T> {
    
    private T foo;

    public void setFoo(T t) {
        foo = t;
    }

    public T getFoo() {
        return foo;
    }

    public void PtrintInfo(){
        System.out.println(foo.getClass().getName());
    }
    
}

class QUser<T1, T2> {
    private T1 foo;
    private T2 bar;

    public void setQUser(T1 t1, T2 t2){
        foo = t1;
        bar = t2;
    }

    public T1 getFoo(){
        return foo;
    }

    public T2 getBar(){
        return bar;
    }

    public String toString() {
        return "타입 출력 - foo = " + foo.getClass().getName() + ", bar = " + bar.getClass().getName();
    }
}

class QDataLimit<T extends Number> {
    private T foo;

    public void setFoo(T t){
        foo = t;
    }

    public T getFoo(){
        return foo;
    }

    public String toString() {
        return "타입 : " + foo.getClass().getName();
    }
}

//조류 객체만

abstract class qBirds {
    abstract public void cry();
}

class qEagle extends qBirds {
    @Override
    public void cry() {
        System.out.println("독수리 울음소리");
    }
}

class qOwl extends qBirds {
    @Override
    public void cry() {
        System.out.println("부엉이 울음소리");
    }
}

class qDog {
    public void cry() {
        System.out.println("멍멍");
    }
}

class qAnimalList<T> {
    ArrayList<T> aList = new ArrayList<>();

    public void set(T t) {
        aList.add(t);
    }

    public T get(int index) {
        return aList.get(index);
    }

    public int sizeList() {
        return aList.size();
    }
}


