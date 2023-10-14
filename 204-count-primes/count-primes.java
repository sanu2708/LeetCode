class Solution {
    public int countPrimes(int n) {
        
          if (n <= 2) {
            return 0;
        }

        // Create a boolean array to mark prime and non-prime numbers
        boolean[] isPrime = new boolean[n];
        // Initially, consider all numbers as prime
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // Mark multiples of primes as non-prime
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        // Count the prime numbers
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }
}