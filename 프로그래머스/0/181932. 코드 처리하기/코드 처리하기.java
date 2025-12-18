class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;

        for (int idx = 0; idx < code.length(); idx++) {
            char ch = code.charAt(idx);

            // mode 전환 처리
            if (ch == '1') {
                mode = 1 - mode;
                continue;
            }

            // mode에 따른 ret 추가 조건
            if (mode == 0) {
                if (idx % 2 == 0) ret += ch;
            } else {  // mode == 1
                if (idx % 2 == 1) ret += ch;
            }
        }

        if (ret.equals("")) ret = "EMPTY";
        return ret;
    }
}