class Solution {
    public int subarraysDivByK(int[] A, int K) {
        int count = 0;
        
        // Map remainder to its frequency
        Map<Integer, Integer> rToFreq = new HashMap<>();
        
        // Accumulative sum
        int accSum = 0;
        for (int num : A) { 
            accSum += num;
            while (accSum < 0) {
                accSum += K;
            }
            
            int r = (accSum % K + K) % K;
            rToFreq.put(r, rToFreq.getOrDefault(r, 0) + 1);
        }
        
        // For subarrays starting from the first element, and share the same remainder
        for (int freq : rToFreq.values()) {
            if (freq > 1) {
                count += freq * (freq - 1) / 2;
            }
        }
        
        // For subarrays starting from the first element, and sum divisible by k
        count += rToFreq.getOrDefault(0, 0);
        
        return count;
    }
}
