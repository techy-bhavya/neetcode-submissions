class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
}

// int i=0 se n, int j i+1 se n, if(nums[i]+nums[j] == tar, toh true, varna
// false
//Sort kardo, and keep index in second column, value in first column, sort
//in ascending order, fir i=0, j=n-1, while i<j, curSum = nums[i]+nums[j],
//if curSum == tar, return new int[]{Math.min(A[i][1],A[j][1]),
//Math.max(A[i][1],A[j][1]);
//else if cursum<tar, then i++, else, j--;
//third solution mein, hashmap mein key pe num, aur value pe index dala hua h
//fir iterate karte hue, over array, diff nikaalte h, if map.containsKey(diff)
// && map.get(diff)!=i, then return new int[]{i,map.get(diff)};, aur end mein
//agar kuch nhi mila, toh return new int[0];
//fourth solution mein prevMap rahega, map banaenge ek, fir iteration start
// karenge, diff nikaalenge, if prevMap.containsKey(diff), return new int[]
//{prevMap.get(diff),i} , and fir prevMap.put(nums[i],i); 
//aur end mein kuch nhi mila, toh return new int[0]
