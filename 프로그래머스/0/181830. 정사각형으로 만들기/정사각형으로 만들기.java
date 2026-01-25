class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        
        int[][] answer;
        
        if(row > col){
            answer = new int[row][row];
        }else if(row < col){
            answer = new int[col][col];
        }else{
            answer = new int[row][col];
        }
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}