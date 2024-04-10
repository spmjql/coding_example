package coding_example.programers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex77484 {
    public int[] solution(int[] lottos, int[] win_nums) {
        List<Integer> lottosList = Arrays.stream(lottos).boxed().collect(Collectors.toList());
        List<Integer> winList = Arrays.stream(win_nums).boxed().collect(Collectors.toList());
        int count = 0;
        int x = 0;
        for( int num : lottosList) {
        	if(winList.contains(num)) count++;
        	if(num == 0) x++;
        }
        return new int[] {7-Math.max(count+x, 1),7-Math.max(count, 1)};
    }
}
/*
2021 Dev-Matching: 웹 백엔드 개발자(상반기)
로또의 최고 순위와 최저 순위

*/