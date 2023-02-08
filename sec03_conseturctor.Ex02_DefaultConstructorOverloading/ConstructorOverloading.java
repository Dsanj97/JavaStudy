// 다양한 생성자를 사용한 객체 생성 방법
public class ConstructorOverloading {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A(3);
        A a3 = new A(1,4);
    }
}

class A{
    A(){
        System.out.println("첫번째 생성자");
    }
    A(int a){
        System.out.println("두번쨰 생성자");
    }
    A(int a, int b){
        System.out.println("세번쨰 생성자");
    }
}
