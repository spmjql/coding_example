package coding_example.programers;

public class Ex250125 {
	
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String targetColor = board[h][w];
        
        answer += boardCheck(board, targetColor, h-1, w);
        answer += boardCheck(board, targetColor, h+1, w);
        answer += boardCheck(board, targetColor, h, w-1);
        answer += boardCheck(board, targetColor, h-1, w+1);
        
        
        return answer;
    }

	private int boardCheck(String[][] board, String targetColor, int h, int w) {
		try {
			if (board[h][w].equals(targetColor)) return 1;
		}catch(ArrayIndexOutOfBoundsException e){}
		return 0;
	}
}
//[PCCE 기출문제] 9번 / 이웃한 칸
