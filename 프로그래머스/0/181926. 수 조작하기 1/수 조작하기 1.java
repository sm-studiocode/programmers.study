class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        char ch;
        // w : +1
        // s : -1
        // d : +10
        // a : -10
        
        for(int i = 0; i<control.length(); i++){
            ch = control.charAt(i);
            if(ch == 'w'){
                n += 1;
            }else if(ch == 's'){
                n -= 1;
            }else if(ch == 'd'){
                n += 10;
            }else{
                n -= 10;
            }
        }
        answer = n;
        return answer;
    }
}