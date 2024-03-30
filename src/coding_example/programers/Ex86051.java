package coding_example.programers;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex86051 {
	
    public int solution(int[] numbers) {
        return IntStream.rangeClosed(1, 9).map(i -> IntStream.of(numbers).boxed().collect(Collectors.toList()).indexOf(i)!=-1?0:i).sum();
    }
}
/*
없는 숫자 더하기
0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
*/