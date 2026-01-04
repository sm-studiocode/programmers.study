class Solution {
    public int[] solution(int[] arr, int[] query) {
        int start = 0;
        int end = arr.length - 1;

        for (int i = 0; i < query.length; i++) {
            int q = query[i];

            if (i % 2 == 0) {
                end = start + q;
            } else {
                start = start + q;
            }
        }

        int[] answer = new int[end - start + 1];
        int idx = 0;

        for (int i = start; i <= end; i++) {
            answer[idx++] = arr[i];
        }

        return answer;
    }
}
