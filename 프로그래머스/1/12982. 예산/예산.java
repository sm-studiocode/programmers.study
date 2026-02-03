import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        
        int num = 0; // 예산 맞추기 변수
        int i=0; // 배열 순회 변수
        while(i<d.length && num <= budget){
            
            num += d[i];
            i++;
            
            if(num < budget){
                answer++;
            }else if(num == budget){
                answer++;
                break;
            }else{
                break;
            }
    
        }
        return answer;
    }
}