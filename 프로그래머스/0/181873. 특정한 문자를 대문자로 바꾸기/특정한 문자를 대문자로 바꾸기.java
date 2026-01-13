class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        char chr;
        
        for(int i=0; i<my_string.length(); i++){
            chr = my_string.charAt(i);
            if(chr == alp.charAt(0)){
                answer += Character.toUpperCase(chr);
            }else{
                answer += chr;
            }
        }
        return answer;
    }
}