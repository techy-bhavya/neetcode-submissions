class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();
        // yaha pe map formation aur element check simultaneously
        //ho rha h, and map mein, current index se just pehle wale
        // elements hi aaye h abhi tak

        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int diff = target - num;
            if(prevMap.containsKey(diff)){
                return new int[]{prevMap.get(diff),i};
            }
            prevMap.put(num,i);
        }
        return new int[]{};
    }
}
