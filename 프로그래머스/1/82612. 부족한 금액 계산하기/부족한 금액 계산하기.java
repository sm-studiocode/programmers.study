class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;
        for(int i=1; i<=count; i++){
            long cnt = price;
            cnt = cnt * i; 
            sum+=cnt;
        }
        answer = money - sum;
        
        if(answer >= 0){
            answer = 0;
        }else{
            answer = Math.abs(answer);
        }
        return answer;
    }
}