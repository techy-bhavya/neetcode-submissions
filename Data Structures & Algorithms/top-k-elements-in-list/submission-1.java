class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int num:nums){
            count.put(num,count.getOrDefault(num,0)+1);
        }
        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: count.entrySet()){
            arr.add(new int[]{entry.getValue(),entry.getKey()});
        }
        arr.sort((a,b) -> b[0]-a[0]);
        //negative hua, toh a pehle, positive toh b pehle
        //therefore, b ka freq zyada, toh voh pehle
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i] = arr.get(i)[1];
        }
        return res;
    }
}
