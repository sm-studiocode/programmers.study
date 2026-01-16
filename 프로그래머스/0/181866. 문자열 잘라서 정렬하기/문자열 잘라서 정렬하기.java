import java.util.*;

class Solution {
    public String[] solution(String myString) {

        String[] temp = myString.split("x");

        List<String> list = new ArrayList<>();

        for(int i = 0; i < temp.length; i++){
            if(!temp[i].equals("")){
                list.add(temp[i]);
            }
        }

        String[] answer = new String[list.size()];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}
