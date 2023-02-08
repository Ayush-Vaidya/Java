class Solution {
    public int jump(int[] nums) {
        
        if(nums.length == 1)
            return 0;
        //java BFS Solution.
        int steps = 1;
        int left = 0;
        int right = nums[0];
        while(true)
        {
            // System.out.println(right);
            if(right >= nums.length-1)
                return steps;
            int max = 0;
            for(int i=left;i<=right;i++)
                max = Math.max(max,i+nums[i]);
            left = right;
            right = max;
            steps++;
        }
    }
}         
