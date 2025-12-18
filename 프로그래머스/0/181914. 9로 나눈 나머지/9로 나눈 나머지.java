class Solution {
    public int solution(String number) {
        int answer = 0;
        char charNumber;
        int intNumber = 0;
        for(int i=0; i<number.length(); i++){
            charNumber = number.charAt(i);
            intNumber += Character.getNumericValue(charNumber);
            answer = intNumber%9;
        }
        return answer;
    }
}