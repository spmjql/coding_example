package coding_example.programers;

import java.util.*;

public class Ex42889 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer, Double> failureRates = new HashMap<>();
        int totalPlayers = stages.length;

        int[] playersAtStage = new int[N + 1];
        for (int stage : stages) {
            playersAtStage[stage - 1]++;
        }

        for (int i = 0; i < N; i++) {
            if (totalPlayers == 0) {
                failureRates.put(i + 1, 0.0);
            } else {
                double failureRate = (double) playersAtStage[i] / totalPlayers;
                failureRates.put(i + 1, failureRate);
                totalPlayers -= playersAtStage[i];
            }
        }

        List<Map.Entry<Integer, Double>> list = new LinkedList<>(failureRates.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Double>>() {
            @Override
            public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
                if (o1.getValue() > o2.getValue()) {
                    return -1;
                } else if (o1.getValue() < o2.getValue()) {
                    return 1;
                } else {
                    return o1.getKey().compareTo(o2.getKey());
                }
            }
        });

        int idx = 0;
        for (Map.Entry<Integer, Double> entry : list) {
            answer[idx++] = entry.getKey();
        }

        return answer;
    }
}
/*
2019 KAKAO BLIND RECRUITMENT
실패율
실패율은 다음과 같이 정의한다.
스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
*/