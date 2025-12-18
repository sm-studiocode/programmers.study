import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < intStrs.length; i++){
            String strNumber = intStrs[i];
            String splitNumber = strNumber.substring(s);

            int j = 0;
            String a = "";

            while(j < l && j < splitNumber.length()){
                a += splitNumber.charAt(j);
                j++;
            }

            int intValue = Integer.parseInt(a);

            if(intValue > k){
                list.add(intValue);
            }
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
