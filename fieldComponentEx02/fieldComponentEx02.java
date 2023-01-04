package fieldComponentEx02;

class A{
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
    void printLoclaVariable(){
        int k;
        //지역변수를 초기화하지 않으므로 오류 발생
        //System.out.println(k);
    }
}
public class fieldComponentEx02 {
    public static void main(String[] args) {
        A a = new A();

        a.printFieldValue();
    }
}
