import java.util.Arrays;

public class stringClass2{

    /*
     * toLowerCase() : 영문문자를 모두 소문자로 바꾼다
     * toUperCase() : 영문문자를 모두 대문자로 바꾼다
     * replace() : 일부 문자열을 다른 묹열로 대체한다
     * substring() : 문자열의 일부분만 포함하는 새로운 문장열 객체를 생성한다
     * split() : 특정기호를 기준으로 문자열을 분리한다
     * trim() : 문자열의 좌우 공백을 제거한다
     * equals() : 두 문자열의 위칫값이 아닌 실제 데이터 값을 비교한다. 이때 대소문자를 구분한다.
     * equalsIgnoreCase() : 두 문자열의 위칫값이 아닌 실제 데이터 값을 비교한다. 이떄 대소문자를 구분하지 않는다.
     */
    public static void main(String[] args) {
        String str1 = "Java Study";

        // 문자열 수정
        // @toLowerCase() toUperCase()
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println();

        // @reolace()
        System.out.println(str1.replace("Study", "공부"));
        System.out.println();

        // @substring()
        System.out.println(str1.substring(0,5)); //0 <= index < 5
        System.out.println();

        // @split
        String[] strArray = "abc/def-ghi jkl".split("/|-| "); // / - 공백으로 구분되는 문자열을 반환
        System.out.println(Arrays.toString(strArray));
        System.out.println();

        // @trim()
        System.out.println("    abc   ".trim());
        System.out.println();

        // 문자열 내용 비교
        String str2 = new String("Java");
        String str3 = new String("Java");
        String str4 = new String("Java");

        // @stack 메모리 비교 (==): 위치(번지) 비교
        System.out.println(str2==str3);
        System.out.println(str3==str4);
        System.out.println(str4==str2);
        System.out.println();

        // @equals(), equalsIgnoreCase()
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str4));
        System.out.println(str3.equalsIgnoreCase(str4));
    }
}