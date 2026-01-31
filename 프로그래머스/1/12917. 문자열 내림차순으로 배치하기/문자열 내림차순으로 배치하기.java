import java.util.*;
class Solution {
public String solution(String s) {
    String answer = "";
    char[] chr = s.toCharArray();  
    Arrays.sort(chr);  
      
    StringBuilder sb = new StringBuilder(new String(chr));  
    answer = sb.reverse().toString();  
    return answer;  
}

}