class Solution {
    public int minFlipsMonoIncr(String s) {
        // variable 'flips' will store the number of flips we will perform
        // variable 'ones' will store the number of 1s
        // we initially want to flip 0s to 1s
        int flips = 0, ones = 0;
        int i = 0;  

        // iterate till we surpass all prefix consecutive zeros
        // because they are already monotonic in nature, hence we won't disturb them
        // if we don't have any prefix 0s, i pointer will remain at the beginning
        while (i < s.length() && s.charAt(i) == '0') {
            i++;
        }

        // Now that we have left some prefix zeros (or even if we did't), 
        // we will see how many 0s can be turned to 1s
        for (; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                flips++;    // if its a 0, increment the count (We are trying to turn the 0s to 1s initially)
            } else {                
                ones++;     // if its a 1, increment the count
            }
            // if at any point we see that 0s are more in number than 1s, we change our decision
            // we will now try to flip 1s to 0s
            // so frequency of 1s would be our number of flips
            if (flips > ones) {
                flips = ones;
            }
        }

        return flips;   // return the number of flips we can perform
    }
}
