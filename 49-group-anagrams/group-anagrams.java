class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>>map=new HashMap<>();

        for(int i=0;i<strs.length;i++)
        {
            char[] ch = strs[i].toCharArray();

            Arrays.sort(ch);
            String str1 = new String(ch);

            if(!map.containsKey(str1))
            {
                map.put(str1, new ArrayList<>());
            }
            map.get(str1).add(strs[i]);

        }
        return new ArrayList<>(map.values());

        
    }
}