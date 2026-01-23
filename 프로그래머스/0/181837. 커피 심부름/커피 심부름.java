class Solution {
    public int solution(String[] order) {
        int answer = 0;
        // 아메리카노 4500
        // 카페라떼 5000
        // anything 4500
        for(int i=0; i<order.length; i++){
            if(order[i].contains("americano")){
                answer += 4500;
            }else if(order[i].contains("cafelatte")){
                answer += 5000;
            }else{
                answer += 4500;
            }
        }
        return answer;
    }
}