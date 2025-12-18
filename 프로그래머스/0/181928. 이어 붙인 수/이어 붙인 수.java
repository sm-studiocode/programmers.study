class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd = ""; // 홀수 변수
        String even = ""; // 짝수 변수
        
        for(int i = 0; i<num_list.length; i++){
            // num_list[i] 값이 짝수일때
            if(num_list[i] % 2 == 0){
                // num_list값 String 변환 > even에 값 이어붙히기
                even += String.valueOf(num_list[i]);
                
            // num_list[i] 값이 홀수있때
            }else{
                // num_list값 String 변환 > odd에 값 이어붙히기
                odd += String.valueOf(num_list[i]);
            }
        }
        
        int oddNum = Integer.parseInt(odd);
        int evenNum = Integer.parseInt(even);
        
        answer = oddNum + evenNum;
        
        return answer;
    }
}