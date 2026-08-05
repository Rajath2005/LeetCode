class Solution {
    public int minMoves2(int[] nums) {

        Arrays.sort(nums);
        int middle=nums[nums.length/2];
        int step=0;
        for(int i=0;i<nums.length;i++)
        {
            step=step+Math.abs(nums[i]-middle);
        }
        return step;
        
    }
}