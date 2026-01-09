class Solution {
    public int solution(int[] arr) {
        int x = 0;
        int n = arr.length;
        int[] tmp = new int[n];

        while (true) {
            boolean changed = false;

            for (int i = 0; i < n; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    tmp[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    tmp[i] = arr[i] * 2 + 1;
                } else {
                    tmp[i] = arr[i];
                }

                if (tmp[i] != arr[i]) {
                    changed = true;
                }
            }

            if (!changed) {
                return x;
            }

            for (int i = 0; i < n; i++) {
                arr[i] = tmp[i];
            }

            x++;
        }
    }
}
