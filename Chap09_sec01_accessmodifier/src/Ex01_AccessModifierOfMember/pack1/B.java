package Ex01_AccessModifierOfMember.pack1;

public class B {
    public void print(){
        //객체생성
        A a = new A();

        //맴버 활용
        System.out.println(a.a + " ");
        System.out.println(a.b + " ");
        System.out.println(a.c + " ");
        /* 클래스 A 는 같은 패키지안에 있으므로 
         * pubilc, protected, default 접근 지정자로
         * 지정된 필드는 사용가능하다
         */

        //System.out.println(a.d + " ");

        /*private 접근 지정자로 지정된 필드는 접근 불가 */
        System.out.println();
    }    
}
