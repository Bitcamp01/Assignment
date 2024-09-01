package __0_Final_Baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _2587 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> arr = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			arr.add(sc.nextInt());
		}
	
		// 평균값
		int sum = 0;
		
		for(int num : arr) {
			sum += num;
		}
		int average = sum / arr.size();
		
		// 이렇게 나는 풀었지만 아래는 찾아본바로
		// 평균 계산
//        int sum = 0;
//        for (int i = 0; i < arr.size(); i++) {
//            sum += arr.get(i); // ArrayList의 i번째 값을 sum에 더함
//        }
//        int average = sum / arr.size(); // sum을 ArrayList의 크기로 나누어 평균을 계산
		// 이렇게 풀기도 한다고 함    
		
		// 중앙값
		Collections.sort(arr);
		int median = arr.get(arr.size() / 2); // 리스트 가운데 값이니까 정렬의 크기의 나누기 2
		
		System.out.println(average);
		System.out.println(median);
		
		
		
		
		

	}

}

/*
	문제
	어떤 수들이 있을 때, 그 수들을 대표하는 값으로 가장 흔하게 쓰이는 것은 평균이다. 평균은 주어진 모든 수의 합을 수의 개수로 나눈 것이다.
	예를 들어 10, 40, 30, 60, 30의 평균은 (10 + 40 + 30 + 60 + 30) / 5 = 170 / 5 = 34가 된다.
	평균 이외의 또 다른 대표값으로 중앙값이라는 것이 있다. 중앙값은 주어진 수를 크기 순서대로 늘어 놓았을 때 가장 중앙에 놓인 값이다.
	예를 들어 10, 40, 30, 60, 30의 경우, 크기 순서대로 늘어 놓으면
	10 30 30 40 60
	이 되고 따라서 중앙값은 30이 된다.
	다섯 개의 자연수가 주어질 때 이들의 평균과 중앙값을 구하는 프로그램을 작성하시오.
	
	입력
	첫째 줄부터 다섯 번째 줄까지 한 줄에 하나씩 자연수가 주어진다. 주어지는 자연수는 100 보다 작은 10의 배수이다.
	
	출력
	첫째 줄에는 평균을 출력하고, 둘째 줄에는 중앙값을 출력한다. 평균과 중앙값은 모두 자연수이다.
 */
