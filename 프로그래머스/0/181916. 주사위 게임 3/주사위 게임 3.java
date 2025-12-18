import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {

        int[] dice = {a, b, c, d};
        Arrays.sort(dice);

        boolean four = dice[0] == dice[3];
        boolean three = dice[0] == dice[2] || dice[1] == dice[3];
        boolean twoTwo = dice[0] == dice[1] && dice[2] == dice[3];
        boolean two = dice[0] == dice[1] || dice[1] == dice[2] || dice[2] == dice[3];

        if (four) {
            return 1111 * dice[0];
        }

        if (three) {
            int p = dice[1];
            int q = (dice[0] == dice[2]) ? dice[3] : dice[0];
            return (10 * p + q) * (10 * p + q);
        }

        if (twoTwo) {
            return (dice[0] + dice[2]) * Math.abs(dice[0] - dice[2]);
        }

        if (two) {
            if (dice[0] == dice[1]) return dice[2] * dice[3];
            if (dice[1] == dice[2]) return dice[0] * dice[3];
            return dice[0] * dice[1];
        }

        return dice[0];
    }
}
