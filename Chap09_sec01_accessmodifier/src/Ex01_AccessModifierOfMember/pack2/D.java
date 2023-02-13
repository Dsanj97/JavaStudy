package Ex01_AccessModifierOfMember.pack2;

import Ex01_AccessModifierOfMember.pack1.A;

public class D extends A{  // D클래스는 A클래스의 자식 클래스
    public void print(){
        // 맴버 활용
        System.out.println(a + " ");
        System.out.println(b + " ");

        /* 자식클래스는 다른 패키지에 있어도 객체 생성없이 protected 
         * 접근 지정자 필드까지 접근 할수있다.
         */

        //System.out.println(c + " ");
        //System.out.println(d + " ");

    }
}
