class Solution {
    public int[] twoSum(int[] nums, int target) {

// isme map mein vahi A matrix jaise value aur uske corresponding
// index hi store kiya h

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        // isme aur iske baad waale most efficient solution mein
        //yehi fark h ki isme pehle se hi pura map bana liya, 
        //value aur corresponding index ka, 
        //uske baad nums pe iterate karna shuru kiya to find
        //complement of current index's element, if present and not
        //at i, tab return.
        for(int i=0;i<nums.length;i++){
            int diff = target-nums[i];
            if(map.containsKey(diff) && map.get(diff)!=i){
                return new int[]{i,map.get(diff)};
            }
        }
        return new int[0];
    }
}
