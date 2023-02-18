package Ex01_StaticField_1;

class A {
    int m = 3;
    static int n = 5;
}

public class StaticField {
    public static void main(String[] args) {
        // 인스턴스 필드 활용 방법(객체를 생성한후 사용 가능)
        A a1 = new A();
        System.out.println(a1.m);

        // 정정 필드 사용 방법(static)
        // 1. 객체생성 없이 클레스명으로 바로 활용
        System.out.println(A.n);
        // 2. 객체를 생성한후 활용(권장하지 않음)
        A a2 = new A();
        System.out.println(a2.n);
    }
}
