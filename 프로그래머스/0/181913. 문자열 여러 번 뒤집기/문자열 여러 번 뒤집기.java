class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        int s = 0;
        int e = 0;

        StringBuilder sb = new StringBuilder(my_string);

        for (int i = 0; i < queries.length; i++) {
            s = queries[i][0];
            e = queries[i][1];

            while (s < e) {
                char temp = sb.charAt(s);
                sb.setCharAt(s, sb.charAt(e));
                sb.setCharAt(e, temp);

                s++;
                e--;
            }
        }

        answer = sb.toString();
        return answer;
    }
}
