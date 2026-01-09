class Solution {
    public int[] solution(int[] arr, int[][] queries) {
    
        int s;
        int e;
        
        for(int i=0; i<queries.length; i++){
            s = queries[i][0];
            e = queries[i][1];
            for(int j=s; j<=e; j++){
                arr[j] = arr[j]+1;
            }
        }
        int[] answer = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}