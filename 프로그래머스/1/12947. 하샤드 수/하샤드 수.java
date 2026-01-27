class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int numX = x;
        while(numX > 0){
            int num = numX % 10;
            numX /= 10;
            sum += num;
        }
        System.out.printf("%d, %d, %d", sum, numX, x);
        if(x%sum != 0){
            answer = false;
        }
        return answer;
    }
}