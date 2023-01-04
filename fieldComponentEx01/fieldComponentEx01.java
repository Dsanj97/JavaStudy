class A {
    int m = 3;               //필드
    int n = 4;               //필드
    void work1(){
        int k = 5;           //지역변수
        System.out.println(k);
        work2(3);          //work2() 안에 있는 지역변수를 스택메모리에 추가
    }
    void work2(int i){       //인수를 변수 i에 대입해 입력배개변수로 활용
        int j = 4;
        System.out.println(i + j);
    }
}

public class fieldComponentEx01 {
    public static void main(String[] args) {
        //class 객체 생성
        A a = new A();
        //필드값 출력
        System.out.println(a.m);
        System.out.println(a.n);
        //메서드 호출
        a.work1();
    }
}
