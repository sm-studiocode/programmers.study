import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < delete_list.length; i++) {
            set.add(delete_list[i]);
        }

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                cnt++;
            }
        }

        int[] answer = new int[cnt];

        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                answer[idx++] = arr[i];
            }
        }

        return answer;
    }
}