class Solution {
    public static int maxSubArray(int arr[]) {
        int ms=Integer.MIN_VALUE;
        int cs =0;
        for(int i=0;i<arr.length;i++){
            cs+=arr[i];
            
        ms=Math.max(cs, ms);
         if(cs<0){
                cs=0;
            }   
        }
        return ms; 
    }
}