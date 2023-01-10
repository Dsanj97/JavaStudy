

public class DefaultConstructor {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        //C c = new C(); 기본 생성자 호출 불가능
        C c = new C(3);

        //메서드 호출 
        a.work();
        b.work();
        c.work();
    }    
}

class A{
    int m;
    void work(){
        System.out.println(m);
    }
    //기본 생성자를 포함하지 않으면 컴파일러가 자동으로 추가
    /*
     * A(){
     * 
     * 
     * }
     */
}

class B{
    int m;
    void work(){
        System.out.println(m);
    }
    // 기본 생성자를 직접 정의
    B(){

    }
}

class C{
    int m;
    void work(){
        System.out.println(m); //생성자로 넘어온 값
    }
    C(int a){  //입력 매개변수를 포함하고 있는 생성자의 정의
        m=a;   //입력매개변수로 전달된 값으로 필드 초기화
    }
}