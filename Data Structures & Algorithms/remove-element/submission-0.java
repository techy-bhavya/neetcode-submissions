class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;//to track position for next valid element
        for(int num:nums){
            if(num!=val){
                nums[k++] = num;
            }
        }
        return k;
    }
}