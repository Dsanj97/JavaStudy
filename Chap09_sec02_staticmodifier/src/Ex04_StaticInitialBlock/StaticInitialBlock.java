package Ex04_StaticInitialBlock;

/* 일반적으로 인스턴스 필드의 초기화는 객체가 만들어지는 시점에 이뤄지는데
 * 정적필드는 객체생성없이 사용 되므로생성자 호출없이 필드초기화가 되어야한다 
 * 정적필드를 초기화하가 위한 문법이 따로 존재한다
 */

class A{
    int a;
    static int b;
    static {  //정적 필드의 초기화는 static{} 내에서 실행
        b = 5; 
        System.out.println("클래스 A가 로딩이 되었습니다.");
    }
    A(){  // 인스턴스의 초기화는 생성자에서 수행
        a = 3; 
    }
}

public class StaticInitialBlock {
    public static void main(String[] args) {
        System.out.println(A.b);
    }
}
