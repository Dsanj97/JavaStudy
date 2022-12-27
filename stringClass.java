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
        System.out.println(str1.indexOf('a',8)); //??
        System.out.println(str1.lastIndexOf('a',8));
        System.out.println(str1.indexOf("java"));
        System.out.println(str1.lastIndexOf("java"));
        System.out.println();

        System.out.println(str2.indexOf("하세요"));             // 앞에서부터 "하세요"가 위치한 인덱스
        System.out.println(str2.lastIndexOf("하세요"));         // 뒤에서부터 "하세요"가 위치한 인덱스
        System.out.println(str2.indexOf('a',8)); //??
        System.out.println(str2.lastIndexOf("고맙습니다")); //값이 없는경우 -1 리턴
    }
}