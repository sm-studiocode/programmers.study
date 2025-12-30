class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char chr;
        for(int i=0; i<n; i++){
            chr = my_string.charAt(i);
            answer += chr;
        }
        return answer;
    }
}