
// class 정의
class A{
    int m = 3;
    void print(){
        System.out.println("객체 생성 및 활용");
    }
}

public class CreateobjectAndUsageMembers {
    public static void main(String[] args) {
        //clas로 객체 생성
        A a = new A();
        
        // class 맴버 활용
        // @필드 활용: 필드에 값 읽기/쓰기
        a.m = 5;
        System.out.println(a.m);

        // @메서드 활용: 메서드 호출
        a.print();
    }
}
