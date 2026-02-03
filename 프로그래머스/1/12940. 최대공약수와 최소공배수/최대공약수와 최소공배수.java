class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int min = Math.min(n, m);
        
        for(int i=1; i<=min; i++){
            
            // 공약수 조건 충족
            // 공약수 = i
            if(n%i == 0 && m%i == 0){
               answer[0] = i;
            }
        }
        int num = answer[0];
        answer[1] = n * m / num;
        return answer;
        
    }
}