public class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}

// int i=0 se n, j=i+1 se n, nums[i]==nums[j] return true, varna false
// Arrays.sort, then i=1 se n, if nums[i]==nums[i-1], return true, varna false
// Hashset seen banao, int i=0 se n, if seen.contains(nums[i]), toh return 
//true, varna false, aur har iteration k end se pehle, seen.add(nums[i]);
//Arrays.stream(nums).distinct().count()<nums.length toh true, varna false

