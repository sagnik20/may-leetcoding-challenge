class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap();
        int count = 0, res = 0;
        map.put(0, 0);
        
        for (int i = 1; i <= nums.length; i++) {
            if (nums[i-1] == 1) count++;
            else count--;
            //Since we are finding max length, we put the count & index in only if its not present
            map.putIfAbsent(count, i);
            res = Math.max(res, i - map.get(count));
        }
        return res;
    }
}
