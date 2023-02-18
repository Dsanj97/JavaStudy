package Ex03_StaticMethod;

class A {
    void abc(){
        System.out.println("인스턴스 매서드");
    }
    static void def(){
        System.out.println("정적 매서드");
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        // 인스턴스 매서드 활용(객체를 생성한후 사용 가능)
        A a1 = new A();
        a1.abc();

        // 정적 매서드 활용
        // 1. 클래스명으로 바로 접근하여 사용
        A.def();
        // 2. 객체를 생성한후 사용(권장하지 않음)
        A a2 = new A();
        a2.abc();
    }
    

}
