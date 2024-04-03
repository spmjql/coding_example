package coding_example.programers;

import java.util.Arrays;

public class Ex12944 {
    public double solution(int[] arr) {
        return Arrays.stream(arr).sum()/(double)arr.length;
    }
}
/*
평균 구하기
정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
*/