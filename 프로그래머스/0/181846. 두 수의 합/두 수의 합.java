import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {

        String answer = "";

        try {
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            answer = String.valueOf(x + y);
        } 
        catch (NumberFormatException e1) {

            try {
                long x = Long.parseLong(a);
                long y = Long.parseLong(b);
                answer = String.valueOf(x + y);
            } 
            catch (NumberFormatException e2) {

                BigInteger x = new BigInteger(a);
                BigInteger y = new BigInteger(b);
                answer = x.add(y).toString();
            }
        }

        return answer;
    }
}