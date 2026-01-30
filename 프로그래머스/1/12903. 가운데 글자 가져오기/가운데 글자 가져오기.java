class Solution {
    public String solution(String s) {
        String answer = "";
        // 짝수면 문자열 길이를 2로 나눠서 나온 몫 : 가져오는 자리수 시작 위치
        // 홀수면 문자열 길이를 2로 나눠서 나온 몫 -1 : 가져오는 자리수 시작위치
        int start = 0;
        if(s.length() % 2 == 0){
            start = s.length() / 2 - 1;
            System.out.println(start);
            answer = s.substring(start, start+2);
        }else{
            start = s.length() / 2;
            System.out.println(start);
            answer = s.substring(start, start+1);
        }
        
        
        return answer;
    }
}