class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int idx = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (i + n < num_list.length) {
                answer[i] = num_list[i + n];
            } else {
                answer[i] = num_list[idx++];
            }
        }

        return answer;
    }
}
