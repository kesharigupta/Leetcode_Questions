class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i =0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i] + nums[j] == target){
                    int a[] = { i,j};
                  return a;
                }
            }
        }
        return null;    
    }
    public static void main(String [] args){
        int nums[] = {3,2,4};
        int target = 6;

    }   
}
