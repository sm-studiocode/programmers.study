import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] aSwer = myStr.split("[abc]");
        List<String> str = new ArrayList<>();
        
        for(int i=0; i<aSwer.length; i++){
            if(aSwer[i].length() == 0){
                continue;
            }else{
                str.add(aSwer[i]);
            }
        }
        
        if(str.isEmpty()){
            str.add("EMPTY");
        }
        
        String[] answer = new String[str.size()];
        for(int i=0; i<str.size(); i++){
            answer[i] = str.get(i);
        }
    
        return answer;
    }
}