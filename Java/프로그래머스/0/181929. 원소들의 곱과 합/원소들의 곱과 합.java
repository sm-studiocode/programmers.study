class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int multiplier = 1;
        
        for(int i = 0; i<num_list.length; i++){
            sum += num_list[i];
        }
        
        for(int j = 0; j<num_list.length; j++){
            multiplier *= num_list[j]; // 840
        }
        sum = sum*sum; // 529
        if(sum > multiplier){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }
}