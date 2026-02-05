class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] last = new int[26];

        for (int i = 0; i < 26; i++) {
            last[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';

            if (last[idx] == -1) {
                answer[i] = -1;
            } else {
                answer[i] = i - last[idx];
            }

            last[idx] = i;
        }

        return answer;
    }
}