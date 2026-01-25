class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int idx = 0;

        for (int i = 0; i < picture.length; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < picture[i].length(); j++) {
                char ch = picture[i].charAt(j);
                for (int t = 0; t < k; t++) {
                    sb.append(ch);
                }
            }

            String line = sb.toString();
            for (int t = 0; t < k; t++) {
                answer[idx++] = line;
            }
        }

        return answer;
    }
}