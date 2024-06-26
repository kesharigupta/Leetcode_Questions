class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int right[] = new int[n];  // rigth
        int left[] = new int [n];  // left 

        // calculate left part
        left[0] = 1;
        for(int i =1; i<n; i++){
            left[i] = left[i-1] * nums[i-1];
        }

        // calculate right part
        right[n-1] = 1;
        for(int i = n -2; i> -1 ;i--){ // reverse loop
            right[i] = right[i+1] * nums[i+1];
        }
         
         // caluclate result
        int result[] = new int[n]; 
        for(int i =0; i<n; i++){
            result[i] = left[i] * right[i];
        }
        return result;
    }
}