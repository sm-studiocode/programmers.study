import java.util.*;
class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] str = binomial.split(" ");
        
        int num1 = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[2]);
        char ch = str[1].charAt(0);
        
        if(ch == '+'){
            answer = num1+num2;
        }else if(ch == '-'){
            answer = num1-num2;
        }else{
            answer = num1*num2;
        }
        
        return answer;
    }
}