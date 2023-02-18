class A {
    boolean m1;
    int m2;
    double m3;
    String m4;
    void printFieldValue(){
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
    }
    void printLocalVariable(){
        int k;
        //System.out.println(k); //초기화하지 않으면 오류발생
    }
}

public class InitialValueOfFieldAndLocalVariable {
    public static void main(String[] args) {
        //클래스 객체 생성
        A a = new A();
        //객체 활용
        a.printFieldValue();
    }
}
