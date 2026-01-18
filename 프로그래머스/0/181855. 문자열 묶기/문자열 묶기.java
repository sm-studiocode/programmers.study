import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] cnt = new int[31];

        for(int i = 0; i < strArr.length; i++){
            cnt[strArr[i].length()]++;
        }

        for(int i = 1; i < cnt.length; i++){
            if(cnt[i] > answer){
                answer = cnt[i];
            }
        }

        return answer;
    }
}