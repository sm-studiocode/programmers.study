class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";

        for(int i=0; i<s; i++){
            answer += my_string.charAt(i);
        }
        for(int j=e; j>=s; j--){
            answer += my_string.charAt(j);
        }
        for(int y=e+1; y<my_string.length(); y++){
            answer += my_string.charAt(y);
        }
        return answer;
    }
}