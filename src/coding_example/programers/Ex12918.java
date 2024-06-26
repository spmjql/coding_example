package coding_example.programers;

public class Ex12918 {
    public boolean solution(String s) {
        try {
        	Long.valueOf(s);
        } catch(NumberFormatException e) {
        	return false;
        }
        int le = s.length();
        if ( !(le == 4 && le == 6) ) return false;
        return true;
    }
}
/*
문자열 다루기 기본
문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
*/