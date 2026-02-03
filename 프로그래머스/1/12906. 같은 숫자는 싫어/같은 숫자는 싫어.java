import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
    
        for(int i=0; i<arr.length; i++){
            
            if(list.size() == 0){
                int num = arr[i];
                list.add(num);
                continue;
            }
            
            if(list.get(list.size()-1) != arr[i]){
                int num = arr[i];
                list.add(num);
            }
            
        }
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}