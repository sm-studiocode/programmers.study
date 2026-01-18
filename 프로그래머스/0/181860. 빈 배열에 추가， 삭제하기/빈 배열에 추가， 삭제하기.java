import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer>list = new ArrayList<>();
        int idx;
        for(int i=0; i<flag.length; i++){
            if(flag[i]){
                idx = arr[i] * 2;
                for(int j=0; j<idx; j++){
                    list.add(arr[i]);
                }
            }else{
                idx = arr[i];
                for(int j=0; j<idx; j++){
                    list.remove(list.size()-1);
                }
            }
        }
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}