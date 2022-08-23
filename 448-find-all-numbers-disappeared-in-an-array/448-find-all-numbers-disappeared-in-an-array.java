class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missing= new ArrayList<>();
        HashSet<Integer> present= new HashSet<>();
        for(int i : nums){
            present.add(i);
        }
        for(int i=1;i<=nums.length;i++){
           if (!present.contains(i))
            missing.add(i);
        }
        return missing;
    }
}