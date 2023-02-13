package Ex03_AccessModifierOfClass_2; // 클래스 AA BB CC 와 다른 위치에 있음

import Ex03_AccessModifierOfClass_2.pack.AA;
import Ex03_AccessModifierOfClass_2.pack.CC;

public class AccessModifierOfClass {
    public static void main(String[] args) {
        // 객체 생성
        //pubilc 클래스이므로 생성가능
        AA a = new AA();

        // default class 생성 불가
        //BB b = new BB();
        // default 생성자 생성 불가
        //CC c = new CC();
    }
}
