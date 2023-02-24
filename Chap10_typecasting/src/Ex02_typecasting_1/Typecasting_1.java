package Ex02_typecasting_1;

// 클래스의 상속관계
class A {}
class B extends A {}
class C extends B {}
class D extends B {}

// A <- B <- C
// B <- D

public class Typecasting_1 {
    public static void main(String[] args) {
        A ac = new C(); // C -> A 업캐스팅(자동변환)
        B bc = (B) new C(); // C -> B 업캐스팅(자동변환)

        B bb = new B();
        A a = (A) bb; // B -> A 업캐스팅

        // 다운캐스팅(수동변환) : 캐스팅 할수없을떄(실행할때 예외발생)
        A aa = new A();
        //B b = (B) aa;  // A -> B 다운캐스팅(수동변환) : 불가능 A 만들어진 aa는 더작은 B 로 들어갈수 없다
        //C c = (C) aa;

        // 다운캐스팅(수동변환) : 캐스팅이 가능할때
        A ab = new B();
        B b = (B) ab;   // A -> B 다운캐스팅(수동변환)
        //C c = (C) ab; // B로 만든 ab는 더작은 C에 들어갈수 없다

        B bd = new D();
        D d = (D) bd;  // B -> D 다운캐스팅(수동변환)

        A ad = new D();
        B b1 = (B) ad;  // A -> B 다운캐스팅(수동변환)
        D b2 = (D) ad;  // A -> D 다운캐스팅(수동변환)
    }
}
