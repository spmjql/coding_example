package coding_example.programers;

import java.util.Arrays;

public class Ex42840 {
    public int[] solution(int[] answers) {
        int[] answer = new int[0];
        String[] randomCase = new String[] {"12345", "21232425", "3311224455"};
        int[] students = new int[3];
        for(int i=0; i<answers.length; i++) {
        	for(int j=0; j<3; j++) {
        		if((Integer.toString(answers[i])).equals(Character.toString(randomCase[j].charAt(i%randomCase[j].length()) ))) students[j]++;
        	}
        }
        int max = Arrays.stream(students).max().getAsInt();
        for(int i=0; i<3; i++) {
        	if (students[i] == max ) {
        		answer = Arrays.copyOf(answer, answer.length+1);
        		answer[answer.length-1] = i+1;
        	}
        }
        return answer;
    }
}
/*
완전탐색
모의고사

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
*/