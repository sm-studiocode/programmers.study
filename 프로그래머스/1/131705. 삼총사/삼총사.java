class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for(int i=0; i<number.length; i++){
            // 첫번째 기준 학생
            int student_1 = number[i];
            
            for(int j=i+1; j<number.length; j++){
                // 두번째 기준 학생과 첫번째 기준 학생은 달라야 함
                int student_2 = number[j];
                
                for(int y=j+1; y<number.length; y++){
                    // 세번째 기준 학생과 두번째 기준 학생은 달라야 함
                    int student_3 = number[y];
                    
                    int num = student_1 + student_2 + student_3;
                    if(num == 0){
                        answer++;
                    }
                }
            }
            
            
        }
        return answer;
    }
}