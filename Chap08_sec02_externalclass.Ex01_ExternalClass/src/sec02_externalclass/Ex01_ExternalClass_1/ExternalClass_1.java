package sec02_externalclass.Ex01_ExternalClass_1;

class A{
    int m = 3;
    int n = 4;

    void print(){
        System.out.println("외부클래스 1번");
    }
}

public class ExternalClass_1 {
    public static void main(String[] args) {
        A a = new A();
        a.print();
    }    
}
