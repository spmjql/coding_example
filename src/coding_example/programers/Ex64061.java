package coding_example.programers;

import java.util.ArrayList;
import java.util.List;

public class Ex64061 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        
        for(int i : moves) {
        	for(int j=0; j<board.length; j++) {
        		if (board[j][i] != 0) {
        			if(list.get(list.size()-1)==board[j][i]) {
        				list.remove(list.size()-1);
        				answer++;
        			} else {
            			list.add(board[j][i]);
        			}
        			
            		board[j][i] = 0;
        			break;
        		}
        	}
        	
        }
        return answer;
    }
}
/*
2019 카카오 개발자 겨울 인턴십
크레인 인형뽑기 게임

*/