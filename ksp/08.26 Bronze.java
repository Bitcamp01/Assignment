//문제
//2022 연세대학교 미래캠퍼스 슬기로운 코딩생활에
//$N$명의 학생들이 응시했다.
//
//이들 중 점수가 가장 높은
//$k$명은 상을 받을 것이다. 이 때, 상을 받는 커트라인이 몇 점인지 구하라.
//
//커트라인이란 상을 받는 사람들 중 점수가 가장 가장 낮은 사람의 점수를 말한다.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int STD = sc.nextInt();
        int GRA = sc.nextInt();

        int[] scores = new int[STD];
        for(int i = 0; i < STD; i++) {
            scores[i] = sc.nextInt();
        }

        for(int i = 1; i < STD; i++) {
            int key = scores[i];
            int j = i - 1;

            while(j >= 0 && scores[j] < key) {
                scores[j + 1] = scores[j];
                j--;
            }

            scores[j + 1] = key;
        }

        System.out.println(scores[GRA - 1]);

        sc.close();
    }
}