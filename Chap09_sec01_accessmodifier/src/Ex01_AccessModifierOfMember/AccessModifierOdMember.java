package Ex01_AccessModifierOfMember;

import Ex01_AccessModifierOfMember.pack1.A;
import Ex01_AccessModifierOfMember.pack1.B;
import Ex01_AccessModifierOfMember.pack2.C;
import Ex01_AccessModifierOfMember.pack2.D;

public class AccessModifierOdMember {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        
        a.print();
        b.print();
        c.print();
        d.print();
    }
}
