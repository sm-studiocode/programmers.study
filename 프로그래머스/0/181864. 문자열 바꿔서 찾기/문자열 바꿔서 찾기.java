class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        char ch;
        String mStr = "";
        
        for(int i=0; i<myString.length(); i++){
            ch = myString.charAt(i);
            if(ch == 'A'){
                mStr += "B";
            }else{
                mStr += "A";
            }
        }
        
        if(mStr.contains(pat)){
            answer = 1;
        }else{
            answer = 0;
        }
        
        System.out.print(mStr);
        return answer;
    }
}