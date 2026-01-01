class Solution {
    public int[] solution(int n, int k) {
        int idx = 0;
        int[] answer = new int[n/k];

        for(int i=k; i<=n; i+=k){
            answer[idx] = i;
            idx++;
        }
        return answer;
    }
}