
class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        String str1 = "";
        String str2 = "";
        
        for(int i=0; i<3; i++){
            str1 += Integer.toString(date1[i]);
            str2 += Integer.toString(date2[i]);
        }
        
        int dateOne = Integer.parseInt(str1);
        int dateTwo = Integer.parseInt(str2);
        
        if(dateOne < dateTwo) answer = 1;
        
        return answer;
    }
}