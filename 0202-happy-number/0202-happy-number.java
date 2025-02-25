class Solution {
        private static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10; 
            sum += digit * digit; 
            n /= 10; 
        }
        return sum;
    }

    
    public boolean isHappy(int n) {
        int[] seenNumbers = new int[1000]; 
        int index = 0; // Index for the array

        while (n != 1) {
            // Check if the number has been seen before
            for (int i = 0; i < index; i++) {
                if (seenNumbers[i] == n) {
                    return false; // Cycle detected
                }
            }

            // Add the current number to the array
            seenNumbers[index++] = n;

            // Replace n with the sum of the squares of its digits
            n = sumOfSquares(n);
        }

        return true; // If we reach 1, it's a happy number
    }
}