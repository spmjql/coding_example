package coding_example.programers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex258712 {
	public static void main(String[] args) {
		String[] a = new String[] {"muzi", "ryan", "frodo", "neo"};
		String[] b = new String[] {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
		
		solution(a, b);
	}
    public static int solution(String[] friends, String[] gifts) {
        int answer = 0;
        List<String> friList = Arrays.asList(friends);
        
        int fleng = friends.length;
        int[][] ans = new int[fleng][fleng];
        int[] answ = new int[fleng];
        
        Map<String, Integer> map = new HashMap<>();
        for(String str : gifts) {
        	String[] gif = str.split(" ");
        	int from = friList.indexOf(gif[0]);
        	int to = friList.indexOf(gif[1]);
        	ans[from][to] += 1;
        	ans[to][from] -= 1;
        	
        	map.put(gif[0], map.getOrDefault(gif[0], 0) + 1);
        	map.put(gif[1], map.getOrDefault(gif[1], 0) - 1);
        }
        
        for(int i=0; i<fleng; i++) {
        	for(int j=0; j<fleng; j++) {
        		if( ans[i][j] > 0 ) {
        			answ[i] += 1;
        		} else if(ans[i][j] == 0) {
        			
        		}
        	}
        }
        
        for( int[] stra : ans) {
        	for(int pp : stra) {
        		System.out.print(pp+" ");
        	}
        	System.out.println();
        }
        System.out.println(map.toString());
        return answer;
    }
}
/*
가장 많이 받은 선물

선물을 직접 전하기 힘들 때 카카오톡 선물하기 기능을 이용해 축하 선물을 보낼 수 있습니다. 당신의 친구들이 이번 달까지 선물을 주고받은 기록을 바탕으로 다음 달에 누가 선물을 많이 받을지 예측하려고 합니다.
*/