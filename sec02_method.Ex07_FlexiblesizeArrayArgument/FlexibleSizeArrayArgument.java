import java.util.Arrays;

public class FlexibleSizeArrayArgument {
    public static void main(String[] args) {
        method1(1,2);
        method1(1,2,3);
        method1();

        method2("자바","공부");
        method2("Method", "안녕", "save");
        method2();
    }

    // int...values -> 갯수와 상관없이 정수를 입력받을수 있음
    public static void method1(int...values) {
        System.out.println("배열의 길이: " + values.length);

        System.out.println("배열 출력 방법1");
        for(int i = 0; i < values.length; i++){
            System.out.println(values[i] + " ");
        }

        System.out.println("배열의 출력 방법2");
        for(int k: values){
            System.out.println(k + " ");
        }

        System.out.println("배열의 출력 방법3");
        System.out.println(Arrays.toString(values));

        System.out.println("-------------------");
    }

    public static void method2(String...values) {
        System.out.println("배열의 길이: "+values.length);

        System.out.println("배열의 출력 방법1");
        for(int i = 0; i < values.length; i++){
            System.out.println(values[i] + " ");
        }

        System.out.println("배열의 출력 방법2");
        for(String k:values){
            System.out.println(k + " ");
        }

        System.out.println("배열의 출력 방법3");
        System.out.println(Arrays.toString(values));

        System.out.println("-------------------");
    }

    
}
