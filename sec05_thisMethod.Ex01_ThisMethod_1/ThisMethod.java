
public class ThisMethod {
    public static void main(String[] args) {
        // 객체 생성
        A a1 = new A();
        System.out.println();
        A a2 = new A();
    }
}

class A{
    A(){
        System.out.println("첫번째 생성자");
    }
    A(int a){
        this(); // 반드시 생성자의 첫번쨰 줄에 위치해야함
        System.out.println("두번째 생성자");
    }
}

/* 클래스 A에는 22개의 생성자가 있고 첫번쨰 생성했을때 al을 생성하면 "첫번쨰 생성자"가 출력된다
 * s2를 생성하면 두번쨰 생성자가 실행이되고 첫번쨰 명령은 this()이므로 같은 클래스 내의 다른 생
 * 성자인 A()를 호출한다.
 */