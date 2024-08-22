//문제
//N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
//
//출력
//첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

import java.util.Scanner;

public class Main {  // 클래스 이름은 항상 대문자로 시작
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < a - 1; i++) {
            int choiceArr = i;  // 현재 선택한 인덱스를 저장
            for(int j = i + 1; j < a; j++) {
                if(arr[j] < arr[choiceArr]) {  // 가장 작은 값을 찾기 위해 비교
                    choiceArr = j;
                }
            }

            // 최소값을 현재 위치의 값과 교환
            int temp = arr[choiceArr];
            arr[choiceArr] = arr[i];
            arr[i] = temp;
        }

        // 정렬된 배열 출력
        for (int i = 0; i < a; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}