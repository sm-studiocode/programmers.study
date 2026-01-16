class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int idx = 0;
        int foundIdx = 0;
        
        while(true){
            foundIdx = myString.indexOf(pat, idx);
            
            if(foundIdx == -1){
                break;
            }
            answer++;
            idx = foundIdx + 1;
        }
        return answer;
    }
}

