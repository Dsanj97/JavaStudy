
public class ThisMethod {
    public static void main(String[] args) {
        // 3가지 객체 생성(this() 미사용)
        A a1 = new A();
        A a2 = new A(10);
        A a3 = new A(10, 20);
        a1.print();
        a2.print();
        a3.print();
        System.out.println();

        // 3가지 객체 생성
        B b1 = new B();
        B b2 = new B(10);
        B b3 = new B(10, 20);
        b1.print();
        b2.print();
        b3.print();
    }
}


class A{
    int m1, m2, m3, m4;
    A(){
        m1 = 1;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }
    A(int a){
        m1 = a;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }
    A(int a, int b){
        m1 = a;
        m2 = b;
        m3 = 3;
        m4 = 4;
    }

    void print(){
        System.out.print(m1+" ");
        System.out.print(m2+" ");
        System.out.print(m3+" ");
        System.out.print(m4);
        System.out.println();
    }
}

class B{
    int m1, m2, m3, m4;
    B(){
        m1 = 1;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }
    B(int a){
        this(); // B() 호출
        m1 = a;
    }
    B(int a, int b){
        this(a); // B(int a) 호출
        m2 = b;
    }

    void print(){
        System.out.print(m1+" ");
        System.out.print(m2+" ");
        System.out.print(m3+" ");
        System.out.print(m4);
        System.out.println();
    }
}

/* class A에서는 this()를 사용하지 않고 필드를 하나씩 초기화하며
 * class B에서는 this()를 사용하여 중복을 줄이며 초기화해나간다.
 */