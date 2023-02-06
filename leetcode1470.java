class Solution {
    public int[] shuffle(int[] nums, int n) {
        int output[] = new int[nums.length];
        for(int i =0,j=0;i<nums.length;i++){
            output[i++] = nums[j++];
            output[i] = nums[n++];
        }
        return output;
    }
}
