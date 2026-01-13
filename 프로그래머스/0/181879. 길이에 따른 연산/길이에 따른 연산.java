class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multiply = 1;
        int len = num_list.length;
        for(int i=0; i<num_list.length; i++){
            if(len >= 11){
                answer += num_list[i];
            }else{
                multiply *= num_list[i];
            }
        }
        if(len < 11){
            answer = multiply;
        }
        
        return answer;
    }
}