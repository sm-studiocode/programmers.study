class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String str = "";
        long numP = Long.parseLong(p);
        
        for(int i=0; i<t.length()-p.length()+1; i++){
            str = t.substring(i, i+p.length());
            
            long num = Long.parseLong(str);
    
            if(num <= numP){
                answer++;
            }
        }
        return answer;
    }
}