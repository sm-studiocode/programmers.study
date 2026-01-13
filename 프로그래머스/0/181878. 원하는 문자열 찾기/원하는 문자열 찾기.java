class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        boolean contains = myString.toLowerCase().contains(pat.toLowerCase());
        
        if(contains){
            answer = 1;
        }
            
        return answer;
    }
}