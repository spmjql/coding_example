package coding_example.programers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ex250121 {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String, Integer> extCode = new HashMap<>();
        extCode.put("code", 0);
        extCode.put("date", 1);
        extCode.put("maximum", 2);
        extCode.put("remain", 3);
        int extInt = extCode.get(ext);
        int sortInt = extCode.get(sort_by);
        
        return Arrays.stream(data).filter(da -> da[extInt]<val_ext).sorted((a, b) -> Integer.compare(a[sortInt], b[sortInt])).toArray(int[][]::new);
    }
}
//[PCCE 기출문제] 10번 / 데이터 분석
//["코드 번호(code)", "제조일(date)", "최대 수량(maximum)", "현재 수량(remain)"]
//data = [[1, 20300104, 100, 80], [2, 20300804, 847, 37], [3, 20300401, 10, 8]]