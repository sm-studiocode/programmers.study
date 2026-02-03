class Solution {
    public int solution(int n) {
        int answer = 0;
        String strNum = "";

        // 3진법
        while (n != 0) {

            int num = n % 3;
            strNum += (num + "");
            n /= 3;

        }

        
        int tenNum = 1;
        // 10진법
        for(int i=strNum.length()-1; i>=0; i--){
            int num = strNum.charAt(i) - '0';
            answer += (num *tenNum);
            tenNum *= 3;
        }
        
        return answer;
    }
}
