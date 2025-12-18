class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        char my_char;
        int index;
        for(int i=0; i<index_list.length; i++){
            index = index_list[i];
            //System.out.println(index);
            my_char = my_string.charAt(index);
            answer+=my_char;
        }
        return answer;
    }
}