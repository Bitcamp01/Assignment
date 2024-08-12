package baekJoon;

import java.util.*;
import java.util.stream.Stream;

public class _1302 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        int cnt=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < cnt; i++) {
            String line = sc.nextLine();
            map.put(line, map.getOrDefault(line, 1) + 1);
        }
        // 최대값을 가진 엔트리 찾기
        int maxCount = Collections.max(map.values());

        // 동일한 최대값을 가진 키들을 정렬하여 가장 작은 키를 출력
        String result = map.entrySet().stream()
                .filter(entry -> entry.getValue() == maxCount)
                .map(Map.Entry::getKey)
                .sorted()
                .findFirst()
                .orElse("");

        System.out.println(result);
    }
}
