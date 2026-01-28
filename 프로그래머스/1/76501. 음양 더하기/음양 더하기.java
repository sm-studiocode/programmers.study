class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 123456789;
        int num = -1;
        
        for(int i=0; i<signs.length; i++){
            if(!signs[i]){
                absolutes[i] *= num;
            }
        }
        answer = 0;
        for(int i=0; i<absolutes.length; i++){
            answer+=absolutes[i];
        }
        return answer;
    }
}