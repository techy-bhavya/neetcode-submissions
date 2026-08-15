class Solution {
    public boolean hasDuplicate(int[] nums) {
        //distinct is a method of stream, ie, IntStream,
        //therefore, Arrays.stream(nums).distinct().count()
        //is how it will work

        return Arrays.stream(nums).distinct().count()<nums.length;
    }
}