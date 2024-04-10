package coding_example.programers;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Ex154538 {
    public int solution(int x, int y, int n) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.offer(x);
        visited.add(x);
        int count = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int current = queue.poll();
                if (current == y) {
                    return count;
                }
                int plusN = current + n;
                int multiply2 = current * 2;
                int multiply3 = current * 3;
                if (!visited.contains(plusN) && plusN <= y) {
                    queue.offer(plusN);
                    visited.add(plusN);
                }
                if (!visited.contains(multiply2) && multiply2 <= y) {
                    queue.offer(multiply2);
                    visited.add(multiply2);
                }
                if (!visited.contains(multiply3) && multiply3 <= y) {
                    queue.offer(multiply3);
                    visited.add(multiply3);
                }
            }
            count++;
        }

        return -1;
    }
}
/*
숫자 변환하기

*/