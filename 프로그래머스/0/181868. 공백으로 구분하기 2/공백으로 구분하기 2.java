class Solution {
    public String[] solution(String my_string) {
        
        String txt = my_string.trim();
        String[] answer = txt.split("\\s+");
        return answer;
    }
}