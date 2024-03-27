package coding_example.programers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Ex118666 {
	
	public static void main(String[] args) {
		
		
		System.out.println( solution(new String[]{"TR", "RT", "TR"}, new int[] {7, 1, 3}) );
	}
	
    public static String solution(String[] survey, int[] choices) {
        String answer = "";
        String[] surveyAr = new String[]{"RT", "TR", "CF", "FC", "JM", "MJ", "AN", "NA"};
        List<String> surList = Arrays.asList(surveyAr);
        int surveyArlength = surveyAr.length;
        int[] score = new int[surveyArlength];
        
        IntStream.rangeClosed(0, survey.length-1).forEach(i->
        	score[ surList.indexOf(survey[i]) ] += (choices[i]-4)*-1
        );
        
        for(int i=0; i<surveyArlength-1; i+=2) {
        	score[i] = score[i]-score[i+1];
        	if(score[i]<0) {
        		answer += surveyAr[i].substring(1,2);
        	} else {
        		answer += surveyAr[i].substring(1);
        	}
        }
        return answer;
    }
}
/*
2022 KAKAO TECH INTERNSHIP
성격 유형 검사하기

survey의 원소는 "RT", "TR", "FC", "CF", "MJ", "JM", "AN", "NA" 중 하나입니다.

지표 번호	성격 유형
1번 지표	라이언형(R), 튜브형(T)
2번 지표	콘형(C), 프로도형(F)
3번 지표	제이지형(J), 무지형(M)
4번 지표	어피치형(A), 네오형(N)

매우 비동의
비동의
약간 비동의
모르겠음
약간 동의
동의
매우 동의

선택지	성격 유형 점수
매우 비동의	네오형 3점
비동의	네오형 2점
약간 비동의	네오형 1점
모르겠음	어떤 성격 유형도 점수를 얻지 않습니다
약간 동의	어피치형 1점
동의	어피치형 2점
매우 동의	어피치형 3점

*/