class Solution {
    public String solution(String s) {
        
        String answer = "";
        
        int cnt = 0;
        for(int i=0; i<s.length(); i++){
            char chr = s.charAt(i);
            String str = chr+"";
            
            if(Character.isWhitespace(chr)){
                answer += str;
                cnt = 0;
                continue;
            }
            if(cnt%2==0){
                answer += str.toUpperCase();
                cnt++;
            }else{
                answer += str.toLowerCase();
                cnt++;
            }
            
            
            
        }
        return answer;
    }
}