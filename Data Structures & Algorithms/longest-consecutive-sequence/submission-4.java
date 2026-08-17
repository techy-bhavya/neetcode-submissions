class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        int res=0;
        for (int num : nums) {

            // Ignore duplicates
            if (!mp.containsKey(num)) {

                // How big are the sequences on either side?
                int left = mp.getOrDefault(num - 1, 0);
                int right = mp.getOrDefault(num + 1, 0);

                // New sequence length
                int length = left + 1 + right;

                // Store length for current number
                mp.put(num, length);

                // Find left and right boundaries
                int leftBoundary = num - left;
                int rightBoundary = num + right;

                // Store length at both boundaries
                mp.put(leftBoundary, length);
                mp.put(rightBoundary, length);

                // Update answer
                res = Math.max(res, length);
            }
        }
        return res;
    }
}
