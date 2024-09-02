package baekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class _2587 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr=new int[5];
        for (int i=0;i<5;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println((int)(Arrays.stream(arr).average().getAsDouble()));
        quickSort(arr,0,arr.length-1);
        System.out.println(arr[2]);
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (arr.length<=1){
            return;
        }
        if (left < right) {
            // 분할의 기준이 되는 피벗을 선택
            int pivotIndex = partition(arr, left, right);

            // 피벗을 기준으로 왼쪽 부분과 오른쪽 부분을 각각 정렬
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    // 배열을 분할하는 메소드
    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];  // 피벗을 배열의 마지막 요소로 설정
        int i = left - 1;  // i는 작은 요소들의 마지막 인덱스를 가리킴

        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                // arr[i]와 arr[j]의 위치를 교환
                swap(arr, i, j);
            }
        }

        // 피벗을 자신의 위치로 이동 (i+1 인덱스와 피벗 위치 교환)
        swap(arr, i + 1, right);

        // 새로운 피벗 위치 반환
        return i + 1;
    }

    // 배열의 두 요소의 위치를 교환하는 메소드
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
