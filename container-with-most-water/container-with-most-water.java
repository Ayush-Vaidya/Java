class Solution {
    public int maxArea(int[] arr) {
        final int N = arr.length;
        int max = 0 , area, i=0, j=N-1;
        while(j>i){
            area = arr[i] < arr[j] ? arr[i] : arr[j];
            area = (j - i) * area;
            if(max < area) max = area;
            if(arr[i] < arr[j]) i++ ;
            else j--;
        }
        return max;
    }
}