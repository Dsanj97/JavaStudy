package Ex02_StaticField_2;

import javax.security.auth.kerberos.KerberosCredMessage;

class A {
    int m = 3;
    static int n = 5;
}

public class StaticField_2 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();

        // 인스턴그 필드
        a1.m = 5;
        a2.m = 5;
        System.out.println(a1.m);
        System.out.println(a2.m);

        // 정적 필드
        a1.n = 7;
        a2.n = 8;
        System.out.println(a1.n);
        System.out.println(a2.n);

        A.n = 9;
        System.out.println(a1.n);
        System.out.println(a2.n);
    }
}
