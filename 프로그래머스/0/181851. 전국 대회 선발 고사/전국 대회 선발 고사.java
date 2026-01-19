import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        for(int i = attendance.length - 1; i >= 0; i--){
            if(attendance[i]){
                list.add(rank[i]);
            }
        }

        Collections.sort(list);

        int r1 = list.get(0);
        int r2 = list.get(1);
        int r3 = list.get(2);

        int a = 0, b = 0, c = 0;

        for(int i=0; i<rank.length; i++){
            if(rank[i] == r1 && attendance[i]){
                a = i;
                break;
            }
        }

        for(int i=0; i<rank.length; i++){
            if(rank[i] == r2 && attendance[i]){
                b = i;
                break;
            }
        }

        for(int i=0; i<rank.length; i++){
            if(rank[i] == r3 && attendance[i]){
                c = i;
                break;
            }
        }

        answer = 10000*a + 100*b + c;
        return answer;
    }
}