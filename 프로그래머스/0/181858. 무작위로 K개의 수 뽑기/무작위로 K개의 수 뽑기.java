import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {

        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                list.add(arr[i]);
            }

            if(list.size() == k){
                break;
            }
        }

        int[] answer = new int[k];

        for(int i = 0; i < k; i++){
            if(i < list.size()){
                answer[i] = list.get(i);
            }else{
                answer[i] = -1;
            }
        }

        return answer;
    }
}