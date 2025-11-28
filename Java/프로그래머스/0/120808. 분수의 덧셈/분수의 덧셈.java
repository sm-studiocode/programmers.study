class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {

        // 1. 두 분모의 최대공약수(GCD)
        int gcd = getGcd(denom1, denom2);

        // 2. 최소공배수(LCM)
        int lcm = denom1 * denom2 / gcd;

        // 3. 공통 분모로 분자를 변환 후 더하기
        int newNumer = numer1 * (lcm / denom1) + numer2 * (lcm / denom2);

        // 4. 기약분수 만들기 위해 분자와 분모의 GCD 구하기
        int finalGcd = getGcd(newNumer, lcm);

        // 5. 기약분수로 반환
        return new int[]{newNumer / finalGcd, lcm / finalGcd};
    }

    // 최대공약수(GCD)
    public int getGcd(int a, int b) {
        if (b == 0) return a;
        return getGcd(b, a % b);
    }
}