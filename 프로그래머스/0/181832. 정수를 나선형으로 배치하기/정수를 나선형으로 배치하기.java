class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        while (top <= bottom && left <= right) {

            // 1) top 행: left -> right
            for (int c = left; c <= right; c++) {
                answer[top][c] = num++;
            }
            top++;

            // 2) right 열: top -> bottom
            for (int r = top; r <= bottom; r++) {
                answer[r][right] = num++;
            }
            right--;

            // 3) bottom 행: right -> left (남은 행이 있을 때만)
            if (top <= bottom) {
                for (int c = right; c >= left; c--) {
                    answer[bottom][c] = num++;
                }
                bottom--;
            }

            // 4) left 열: bottom -> top (남은 열이 있을 때만)
            if (left <= right) {
                for (int r = bottom; r >= top; r--) {
                    answer[r][left] = num++;
                }
                left++;
            }
        }

        return answer;
    }
}