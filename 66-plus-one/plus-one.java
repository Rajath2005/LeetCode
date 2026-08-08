class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length - 1;

        while (n >= 0 && digits[n] == 9) {
            digits[n] = 0;
            n--;
        }
if (n >= 0) {
            digits[n] = digits[n] + 1;
            return digits;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
        
    }
}