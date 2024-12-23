import java.util.ArrayList;

public class Generic04 {

    public static void main(String[] args) {
        /*
         * 제네릭과 배열 리스트(ArrayList) 함께 사용하기
         * - 많이 사용되는 것 중 하나이므로 숙달될 때까지 반복해서 연습하는 게 중요!
         * - 더욱 자세한 건 추후 컬렉션 파트에서 자세히.
         * 
         * 조류 객체만 담는 클래스를 만들어보시오.
         *      1. Birds 클래스를 추상 클래스로 만들고, 추상 메서드 cry() 메서드를 정의한다.
         *      2. Birds 클래스를 상속 받는 Eagle, (3.)Owl 자식 클래스를 만들고 cry() 메서드를 구체적으로 구현
         *      4. Dog 클래스를 만들고, Birds 클래스는 상속 받지 않는다.
         *      5. AnimalList 클래스를 제네릭으로 만들고, Eagle, Owl 객체를 ArrayList에 저장한다.
         */

         AnimalList<Birds> birdsList = new AnimalList<>();

        // 추가하기
         birdsList.setItem( new Eagle() );
         birdsList.setItem( new Owl() );
         //birdsList.setItem( new Dog() ); 오류

         // 가져오기
         System.out.println( "index0 : " + birdsList.getItem(0) ); // Eagle@7a81197d
         System.out.println( "index1 : " + birdsList.getItem(1) ); // Owl@3f99bd52
         System.out.println("===========================================");
         
         // 반복문으로 객체 모두 출력
         for( int i=0; i < birdsList.getSize(); i++ ) {
             birdsList.getItem(i).cry();
            }
        System.out.println("===========================================");
         
         // 사이즈 출력
         System.out.println( "현재 리스트에 저장된 객체 수 : " + birdsList.getSize() );
         System.out.println("===========================================");
    }

}

// 1.
abstract class Birds { abstract void cry(); }

// 2.
class Eagle extends Birds {
    @Override
    void cry() { System.out.println("독수리 울음소리"); }
}

// 3.
class Owl extends Birds {
    @Override
    void cry() { System.out.println("부엉이 울음소리"); }
}

// 4.
class Dog { void cry() { System.out.println("멍멍"); } }

// 5.
class AnimalList<T> {
    ArrayList<T> aList = new ArrayList<>();

    // Setter Method
    public void setItem(T obj) {
        aList.add(obj);
    }

    // Getter
    public T getItem( int index ) { 
        return aList.get(index);
    }

    // Size()
    public int getSize() {
        return aList.size();
    }
}

