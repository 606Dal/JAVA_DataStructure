package Collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Collection07 {

    public static void main(String[] args) {

        /*
         * 컬렉션 프레임워크 - 링크드리스트, 스택, 큐
         *
         */

        System.out.println();
        testLinkedList();
        System.out.println("===============링크드리스트==============");

        System.out.println();
        testStack();
        System.out.println("===============스택==============");

        System.out.println();
        testQueue();
        System.out.println("===============큐==============");

        
    }

    public static void testLinkedList() {
        /*
         * - java.util 패키지에 소속, import 필요
         * - Iterable <-- Collection <-- List[Set/Queue] <-- LinkedList 클래스
         * 
         * 배열리스트 vs 링크드리스트
         * - 사용하는 메서드가 거의 같음.
         * - 배열리스트는 내부적으로 배열을 이용하는 자료구조,
         *   링크드리스트는 노드를 이용하여 데이터를 저장, 관리.
         *   (노드는 곧 데이터, 여기에 다음 요소를 가리키는 참조 링크도 같이 가지고 있다고 보면 됨)
         * - 배열은 순차적으로 요소(데이터)가 저장되지만, 링크드리스트는 요소들이 순차적이지 않더라도 다음 요소를 가리키는 링크로 인해 순차적인 관리가 가능.
         */

        // 링크드리스트 객체 생성
        List<String> list = new LinkedList<>();

        // 요소 추가
        list.add("Superman");
        list.add("Batman");
        list.add("Antman");
        list.add("Wonderwoman");
        list.add("Ironman");

        for( int i = 0; i < list.size(); i++) {
            System.out.println( list.get(i) );
        }

        list.remove(3);

        list.set(list.size()-1, "아이언맨");
        System.out.println();
        for( String item : list ) {
            System.out.println( item );
        }
    }

    public static void testStack() {
        /* 
         * - Stack 클래스는 Vector 클래스를 상속받아 만들어진 것
         * - 후입선출 방식 또는 LIFO(Last In, First Out) 방식으로 데이터 처리가 이루어지는 자료구조 형태.
         *   가장 나중에 저장된(push) 데이터가 가장 먼저 나오게(pop) 되는 자료구조
         * 
         *  ex) Undo 기능(ctrl+z), 브라우저 뒤로 가기, 역순으로 글자 출력하기 등
         * 
         * - 주요 메서드
         *      push()  // 스택의 맨 위에 요소 추가
         *      pop()   // 스택의 맨 위에 있는(제일 마지막에 저장된) 요소를 꺼내고 나서 삭제
         *      peek()  // 꺼내기만 함
         *      empty() // 스택이 비어있는지 체크. 비었으면 true, 아니면 false 반환
         *      search()    // 위치 반환 (주의! 맨 위에 있는 요소가 1)
         *      size()
         *      clear()
         * 
         * - 구현 시 주로 사용되는 클래스
         *   Stack 클래스를 사용해도 되지만 더 빠른 스택 구현을 위해서 Deque 인터페이스를 구현한 ArrayDeque 클래스를 사용하곤 함.
         *   ArrayDeque 클래스는 자료구조의 스택과 큐를 모두 구현할 수 있음. (단, 제한되는 메서드도 있음을 기억)
         */

        // 스택 구현
        Stack<Integer> stack = new Stack<>();
        //Deque<Integer> stack = new ArrayDeque<>();

        // 스택에 요소 추가
        stack.push(7);
        stack.push(9);
        stack.push(5);
        stack.push(3);
        stack.push(6);

        // 요소 반환
        System.out.println( stack.peek() ); // 6
        System.out.println( stack ); // [7, 9, 5, 3, 6]
        
        // 스택에서 반환 후 삭제
        System.out.println( stack.pop() ); // 6
        System.out.println( stack ); // [7, 9, 5, 3]

        // 요소 검색
        // 만약 스택에 없는 값을 검색하면 -1을 반환함.
        System.out.println( "----------검색----------" );
        System.out.println( stack.search(3) );  // 1
        System.out.println( stack.search(1) );  // -1
        System.out.println( stack.search(7) );  // 4
        System.out.println( stack.search(9) );  // 3
        System.out.println( stack.search(6) );  // -1

        // 인덱스로 값 가져오기
        System.out.println();
        System.out.println("0번째 값 : " + stack.get(0));         // 7
        System.out.println("마지막 값 : " + stack.get(stack.size()-1)); // 3
        
        // 스택에 있는 요소 수 구하기
        System.out.println("현재 요소 수 : " + stack.size()); // 4

        // 스택이 비었는지
        System.out.println("현재 요소 수 : " + stack.empty()); // false

        // 전체 출력
        //for ( int i = 0; i < stack.size(); i++)
        //    System.out.println(stack.get(i));
        for (int i : stack )
            System.out.println( i );
        System.out.println();

        // 스택에 쌓인 순서대로 출력 (거꾸로 출력)
        for ( int i=stack.size()-1; i >= 0; i-- )
            System.out.println( stack.get(i) );

        // 스택 비우기
        stack.clear();
        System.out.println("스택 비었나요? " + stack.empty()); // true
    }

    public static void testQueue() {
        /*
         * - 선입선출 FIFO(First In, First Out) 방식으로 데이터 처리가 이루어지는 자료구조 형태
         * - 가장 먼저 저장된(push) 데이터가 가장 먼저 나오게(pop) 되는 구조
         * - ArrayDeque 클래스로 구현하는 것도 가능.
         * - 보통 큐 자료구조를 구현하는 경우 deque 인터페이스를 구현한 LinkedList 클래스를 사용
         * 
         * ex) 관공서, 은행 등의 대기번호 표, 프린터 대기열 등
         * 
         * - 주요 메서드
         *      add()       // 스택의 push() 메서드에 해당
         *      poll()      // 스택의 pop() 메서드에 해당, 큐가 비었으면 null 반환
         *      peek()      // 삭제하지 않고 반환
         *      remove()
         *      element()   // 큐 맨 앞에 있는(가장 먼저 저장된) 요소 반환
         *      offer()     // 큐 맨 뒤쪽에 요소를 삽입
         */

        // 큐 객체 생성
        // Queue<String> queue = new LinkedList<>();
        LinkedList<String> queue = new LinkedList<>();

        // 큐에 요소 추가
        queue.add("홍길동");
        queue.add("이순신");
        queue.add("강감찬");

        // 큐에 있는 요소 반환
        System.out.println( queue.peek() ); // 홍길동
        System.out.println( queue ); // [홍, 이, 강]

        // 큐에 있는 요소 반환 + 삭제
        System.out.println( queue.poll() ); // 홍길동
        System.out.println( queue ); // [이, 강]
        
        // 값으로 요소 삭제
        queue.remove("이순신");
        System.out.println( queue ); // [강]

        // 큐에 있는 요소 수 구하기
        System.out.println("현재 큐의 요소 수는? => " + queue.size());

        // 큐가 비었는지
        System.out.println("큐 비었나요? => " + queue.isEmpty());

        // 큐 비우기
        queue.clear();
        System.out.println("큐 비었나요? => " + queue.isEmpty());

        // 추가
        queue.add("광개토대왕");
        queue.add("세종대왕");
        queue.add("장수왕");

        System.out.println();
        for( String s : queue )
            System.out.println(s);
        
        // 맨 앞에 있는 요소 반환
        System.out.println("맨 앞에 있는 요소는? => " + queue.element() ); // 광개토대왕

        // offer 메서드 : 제일 뒤에 추가
        queue.offer("정조");
        System.out.println( queue ); // [광개토대왕, 세종대왕, 장수왕, 정조]

        // offerFirst 메서드 : 제일 앞에 추가
        queue.offerFirst("영조");
        System.out.println( queue ); // [영조, 광개토대왕, 세종대왕, 장수왕, 정조]
        
        // 중간에 요소 삽입
        queue.add(2, "이성계");
        System.out.println( queue ); // [영조, 광개토대왕, 이성계, 세종대왕, 장수왕, 정조]
    }

}


