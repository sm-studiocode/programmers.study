class Solution {
    public long solution(long n) {
        long answer = -1;
        
        double num = Math.sqrt(n);
        long lNum = (long)num;
        if(lNum * lNum == n){
            answer = (lNum+1)*(lNum+1);
        }   
        return answer;
    }
}