# n과 k를 입력.
# n은 학생의 수, k는 상을 받을 학생의 수
n, k = map(int, input().split())  # map으로 두 개의 입력을 정수로 변환 

# 각 학생의 점수를 입력받고 내림차순으로 정렬. << 높은 거 부터
scores = sorted(map(int, input().split()), reverse=True)  # 학생 점수를 정수로 변환 후, 내림차순으로 정렬합니다.

# 상을 받는 학생들 중 가장 낮은 점수를 커트라인
print(scores[k-1])
