class A{
    //리턴타입 void, 입력매개변수 없음
    void print(){
        System.out.println("안녕");
    }
    //리턴타입 int, 입력매개변수 없음
    int data(){
        return 3;
    }
    //리턴타입 double, 입력매개변수 2개
    double sum(int a, double b){
        return a+b;
    }
    //리턴타입 void, 내부에 리턴포함(함수 종료)
    void printMonth(int m){
        if(m < 0 || m > 12 ){
            System.out.println("잘못된 입력");
            return;
        }
        System.out.println(m+"월 입니다");
    }
}

public class ExternalCallMethods {
    public static void main(String[] args) {
        A a = new A();

        a.print();
        int k = a.data();
        a.data();
        System.out.println(k);
        double result = a.sum(3,5.2);
        System.out.println(result);
        a.printMonth(5);
        a.printMonth(15);
    }
}
