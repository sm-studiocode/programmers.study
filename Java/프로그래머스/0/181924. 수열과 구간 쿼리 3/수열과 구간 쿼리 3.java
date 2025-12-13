class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int iIndex = 0;
        int jIndex = 0;
        int number = 0;
        for(int i = 0; i<queries.length; i++){
            iIndex = queries[i][0];
            jIndex = queries[i][1];
            
            number = arr[iIndex];
            arr[iIndex] = arr[jIndex];
            arr[jIndex] = number;

        }
        
        return arr;
    }
}