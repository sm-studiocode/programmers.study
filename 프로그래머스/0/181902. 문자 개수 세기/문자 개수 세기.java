class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char chr;
        
        for (int i = 0; i < my_string.length(); i++) {
            chr = my_string.charAt(i);
            
            if (chr >= 'A' && chr <= 'Z') {
                answer[chr - 'A']++;
            } else {
                answer[chr - 'a' + 26]++;
            }
        }
        
        return answer;
    }
}
