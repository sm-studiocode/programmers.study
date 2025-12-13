import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        List<Integer> answer = new ArrayList<>();

        int queS = 0;
        int queI = 0;
        int queE = 0;

        int min;
        boolean found;

        for (int i = 0; i < queries.length; i++) {

            queS = queries[i][0];
            queI = queries[i][1];
            queE = queries[i][2];

            min = 0;
            found = false;

            for (int j = queS; j <= queI; j++) {

                if (arr[j] > queE) {

                    if (!found) {
                        min = arr[j];
                        found = true;
                    } else {
                        if (arr[j] < min) {
                            min = arr[j];
                        }
                    }
                }
            }

            if (found) {
                answer.add(min);
            } else {
                answer.add(-1);
            }
        }

        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }

        return result;
    }
}
