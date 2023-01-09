public class MethodOverloading {
    public static void main(String[] args) {
        //서로다른 시그니처를 지니고 있는 print() 메서드를 입력매개변수에 따라 호출
        print();
        print(3);
        print(3.2);
        print(4,8);
    }

    public static void print() {
        System.out.println("데이터가 없습니다.");
    }

    public static void print(int a) {
        System.out.println(a);
    }

    public static void print(double a) {
        System.out.println(a);
    }

    public static void print(int a, int b) {
        System.out.println("a: "+ a + " b: "+ b);
    }
}
