package sec01_packageimport.Ex01_PackageImport_1;

import sec01_packageimport.common.A;

public class PackageImport_1 {
    public static void main(String[] args) {
        // 객체생성
        // A a = new A(); 생성불가

        sec01_packageimport.common.A a = new sec01_packageimport.common.A();

        // 맴버 활용
        System.out.println(a.m);
        System.out.println(a.n);
        a.print();
    }
}
