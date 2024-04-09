package coding_example.programers;

import java.util.*;

public class Ex92334 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        List<String> list = Arrays.asList(id_list);
        Map<Integer, Set<Integer>> reportMap = new HashMap<>();
        
        for( String rep : report ) {
        	String[] repo = rep.split(" ");
        	int reported = list.indexOf(repo[1]);
        	
            if (!reportMap.containsKey(reported)) {
                reportMap.put(reported, new HashSet<>());
            }
            reportMap.get(reported).add(list.indexOf(repo[0]));
        }
        
        reportMap.forEach((key,value)->{ if(value.size() >= k)value.forEach(i -> answer[i]++); });
        return answer;
    }
}
/*
2022 KAKAO BLIND RECRUITMENT
신고 결과 받기

*/