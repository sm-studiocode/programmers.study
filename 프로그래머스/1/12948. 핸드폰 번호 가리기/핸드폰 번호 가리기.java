class Solution {
    public String solution(String phone_number) {
        
        StringBuilder sb = new StringBuilder(phone_number);
        String answer = "";
    
        for(int i=0; i<sb.length()-4; i++){
            sb.setCharAt(i, '*');
        }
        System.out.print(sb.toString());
        answer = sb.toString();
        return answer;
    }
}