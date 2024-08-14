//문제
//알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.
//한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int len = s.length();
        System.out.print(s.charAt(0));
        for(int i = 1; i < len; i++) {
            if(i % 10 == 0)
                System.out.println();
            System.out.print(s.charAt(i));
        }
        sc.close();
    }
}
