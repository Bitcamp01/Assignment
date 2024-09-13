#include <stdio.h>
#include <stdlib.h>  

// 숫자 두 개를 비교
int compare(const void *a, const void *b) {
    int num1 = *(int*)a;
    int num2 = *(int*)b;
    
    if (num1 < num2) return -1; // num1이 num2보다 작다? 당연히 num1이 먼저
    if (num1 > num2) return 1;  // num1이 num2보다 크다? num1이 뒤로 가야지
    return 0;
}

// 이진 탐색으로 숫자를 찾는 마법의 함수
int binary_search(int arr[], int size, int target) {
    int left = 0;
    int right = size - 1;
    
    while (left <= right) {
        int mid = left + (right - left) / 2; // 중간 지점을 계산
        
        if (arr[mid] == target) {
            return 1;
        } else if (arr[mid] < target) {
            left = mid + 1; // target이 더 크다? 왼쪽에선 못 찾겠다
        } else {
            right = mid - 1; // target이 더 작다? 오른쪽으로 가자
        }
    }
    
    return 0;
}

int main() {
    int N, M;
    
    // 먼저 배열의 크기 N을 입력받자
    scanf("%d", &N);
    int arr[N];
    
    // 배열의 요소들을 입력받자
    for (int i = 0; i < N; i++) {
        scanf("%d", &arr[i]);
    }
    
    // 배열을 정렬해서 찾기 쉬운 상태로 만들자
    qsort(arr, N, sizeof(int), compare);
    
    // 찾을 숫자의 개수 M을 입력받자
    scanf("%d", &M);
    
    // 찾고자 하는 숫자들을 하나씩 검색해보자
    for (int i = 0; i < M; i++) {
        int target;
        scanf("%d", &target);
        
        if (binary_search(arr, N, target)) {
            printf("1\n"); 
        } else {
            printf("0\n"); 
        }
    }

    return 0;
}
