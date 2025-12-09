class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        for(int i=0; i<num_list.length; i++){
            answer[i] = num_list[i];
        }
        int lastNum = answer[answer.length-2];
        int beforeLastNum = answer[answer.length-3];
        
        if(lastNum > beforeLastNum){
            answer[answer.length-1] = lastNum - beforeLastNum;
        }else{
            answer[answer.length-1] = lastNum * 2;
        }
        
        return answer;
    }
}