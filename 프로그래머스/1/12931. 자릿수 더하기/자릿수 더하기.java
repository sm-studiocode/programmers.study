import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = n + "";
        
        for(int i=0; i<str.length(); i++){
            char chr = str.charAt(i);
            answer += (chr-'0');
        }
        

        return answer;
    }
}