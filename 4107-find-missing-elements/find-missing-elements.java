class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        int min = nums[0];
        int max = nums[0];
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        for (int i = min; i < max; i++) {
            boolean exist = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    exist = true;
                    break;
                }

            }
            if (!exist) {
                ans.add(i);
            }

        }
        return ans;

    }
}