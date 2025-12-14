class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        int queryS;
        int queryE;
        int queryK;

        for(int i = 0; i < queries.length; i++){
            queryS = queries[i][0]; 
            queryE = queries[i][1]; 
            queryK = queries[i][2]; 

            for(int j = queryS; j <= queryE; j++){

                if(queryK != 0 && j % queryK == 0){
                    arr[j] += 1; 
                }
            }
        }

        return arr;
    }
}
