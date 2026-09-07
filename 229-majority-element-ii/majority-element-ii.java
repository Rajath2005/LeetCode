class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        HashSet<Integer>hash = new HashSet<>();
        
        for(int num:nums)
        {
           int count=0;

           for(int i:nums)
           {
            if(i==num)
            {
                count++;
            }
           }

           if(count>n/3)
           {
            hash.add(num);
           }
        }
        return new ArrayList<>(hash);
        
    }
}