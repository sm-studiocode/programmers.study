class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for(int i=1; i<food.length; i++){
            int num = 0;
            num = food[i] / 2;
            if(num == 0){
                continue;
            }else{
                for(int j=0; j<num; j++){
                    sb.append(i);
                }
            }
        }
        answer = sb.toString()+"0";
        sb.reverse();
        answer += sb.toString();
        return answer;
    }
}