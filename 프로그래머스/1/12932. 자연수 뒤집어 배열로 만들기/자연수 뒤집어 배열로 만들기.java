class Solution {
    public int[] solution(long n) {
        String idx = n + "";
        int[] answer = new int[idx.length()];
        int i = 0;
        
        while(n>0){
            long num = n%10;
            answer[i] = (int)num;
            n /= 10;
            i++;
        }
        
        return answer;
    }
}