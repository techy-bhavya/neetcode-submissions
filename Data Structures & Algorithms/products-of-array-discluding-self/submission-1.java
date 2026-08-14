class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prod = 1;
        int zero_count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zero_count++;
            }
            else{
                prod*=nums[i];
            }
        }
        if(zero_count>=2){
            return new int[n];
        }
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            if(zero_count==1){
                res[i] = (nums[i]==0)?prod:0;
            }
            else{
                res[i] = prod/nums[i];
            }
        }
        return res;
    }
}  
