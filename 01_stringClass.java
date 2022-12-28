import java.util.Arrays;

// String class의 주요 메서드

public class stringClass{
    public static void main(String[] args) {
        String str1 = "Hello java";
        String str2 = "안녕하세요! 반갑습니다";

        System.out.println(str1.length()); // str1의 문자 길이
        System.out.println(str2.length()); // str2의 문자 길이
        System.out.println();

        // 문자열 검색
        // @charAt()
        System.out.println(str1.charAt(1)); // 한글 문 관계없이 index 1번 위치의 문자
        System.out.println(str2.charAt(1));
        System.out.println();

        // @indexOf(), lastIndex()
        System.out.println(str1.indexOf('a'));             // 앞에서부터 a가 위치한 인덱스
        System.out.println(str1.lastIndexOf('a'));         // 뒤에서부터 a가 위치한 인덱스
        System.out.println(str1.indexOf('a',8)); 
        System.out.println(str1.lastIndexOf('a',8));
        System.out.println(str1.indexOf("java"));
        System.out.println(str1.lastIndexOf("java"));
        System.out.println();

        System.out.println(str2.indexOf("하세요"));             // 앞에서부터 "하세요"가 위치한 인덱스
        System.out.println(str2.lastIndexOf("하세요"));         // 뒤에서부터 "하세요"가 위치한 인덱스
        System.out.println(str2.indexOf('a',8)); //??
        System.out.println(str2.lastIndexOf("고맙습니다")); //값이 없는경우 -1 리턴
        System.out.println();

        // 문자열 변환 및 연결
        // @String.valueOf(기본 자료형): 기본 자료형 -> 문자열 변환
        String str3 = String.valueOf(2.3);
        String str4 = String.valueOf(false);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println();

        // @concat(): 문자열 연결
        String str5 = str3.concat(str4);
        System.out.println(str5);
        System.out.println();

        // String.valueOf() + concat()
        String str6 = "안녕" + 3;
        String str7 = "안녕".concat(String.valueOf(3));
        System.out.println(str6);
        System.out.println(str7);
        System.out.println();

        // 문자열을 byte[] 또는 char[]로 변환
        String str8 = "Hellow Java";
        String str9 = "안녕하세요";

        // @getBytes(): 문자열 -> byte[] 변환
        byte[] array1 = str8.getBytes();
        byte[] array2 = str9.getBytes();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println();

        // @toCharArray(): 문자열 -> char[] 변환
        char[] array3 = str8.toCharArray();
        char[] array4 = str9.toCharArray();
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));

    }
}