class Solution {
    public String solution(String myString) {
        String answer = "";
        char ch;
        int asciiL = 'l';
        int asc = 0;
        
        for(int i=0; i<myString.length(); i++){
            ch = myString.charAt(i);
            asc = ch;
            if(ch < asciiL){
                answer += "l";
            }else{
                answer += String.valueOf(ch);
            }
        }
        return answer;
    }
}