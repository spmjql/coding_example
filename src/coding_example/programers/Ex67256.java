package coding_example.programers;

public class Ex67256 {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int[][] keypad = {
            {3, 1}, {0, 0}, {0, 1}, {0, 2},
            {1, 0}, {1, 1}, {1, 2},
            {2, 0}, {2, 1}, {2, 2}
        };
        int[] leftHand = {3, 0};
        int[] rightHand = {3, 2}; 
        
        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                answer.append("L");
                leftHand = keypad[number];
            } else if (number == 3 || number == 6 || number == 9) {
                answer.append("R");
                rightHand = keypad[number];
            } else { 
                int[] numberPos = keypad[number];
                int leftDistance = Math.abs(leftHand[0] - numberPos[0]) + Math.abs(leftHand[1] - numberPos[1]);
                int rightDistance = Math.abs(rightHand[0] - numberPos[0]) + Math.abs(rightHand[1] - numberPos[1]);
                
                if (leftDistance < rightDistance || (leftDistance == rightDistance && hand.equals("left"))) { // 왼손이 더 가까운 경우 또는 왼손잡이인 경우
                    answer.append("L");
                    leftHand = numberPos;
                } else { 
                    answer.append("R");
                    rightHand = numberPos;
                }
            }
        }
        return answer.toString();
    }
}
/*
2020 카카오 인턴십
키패드 누르기


*/