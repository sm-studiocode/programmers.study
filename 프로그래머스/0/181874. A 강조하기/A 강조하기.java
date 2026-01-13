class Solution {
    public String solution(String myString) {
        String answer = "";
        char chr;

        for(int i=0; i<myString.length(); i++){
            chr = myString.charAt(i);

            if(chr == 'a'){
                answer += 'A';
            }else if(chr >= 'A' && chr <= 'Z' && chr != 'A'){
                answer += Character.toLowerCase(chr);
            }else{
                answer += chr;
            }
        }
        return answer;
    }
}
