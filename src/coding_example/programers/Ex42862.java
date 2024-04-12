package coding_example.programers;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex42862 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        Set<Integer> reserveList = Arrays.stream(reserve).boxed().collect(Collectors.toSet());
        List<Integer> lostList = Arrays.stream(lost).boxed().sorted().collect(Collectors.toList());
        for(int num : lost) {
	    	if(reserveList.contains(num)) {
	    		reserveList.remove((Integer)num);
	    		lostList.remove((Integer)num);
	    		answer++;
	    	}
        }
        for(int num : lostList) {
        	if(reserveList.contains(num-1)) {
        		reserveList.remove((Integer)num-1);
        		answer++;
        	}
        	else if(reserveList.contains(num+1)) {
        		reserveList.remove((Integer)num+1);
        		answer++;
        	}
        }
        return answer;
    }
}
/*
탐욕법(Greedy)
체육복

*/