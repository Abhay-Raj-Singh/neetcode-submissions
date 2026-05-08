class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums)
        {
            if(!set.add(i)){
            return true;
            }
        }
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]==nums[i+1])
        //     return true;
        // }
        return false;
    }
}