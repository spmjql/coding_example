package coding_example.programers;

import java.util.Set;
import java.util.TreeSet;

public class Ex68644 {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> set = new TreeSet<>();
        for(int i=0; i<numbers.length; i++) {
        	for(int j=1; i+j<numbers.length; j++) {
        		set.add(numbers[i]+numbers[i+j]);
        	}
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
/*
두 개 뽑아서 더하기
정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
*/