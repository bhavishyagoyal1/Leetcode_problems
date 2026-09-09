class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashSet<Integer> seen=new HashSet<>();
        HashSet<Integer> exist=new HashSet<>();
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                seen.add(nums[i-1]);
            }
            if(seen.contains(nums[i])){
                exist.add(nums[i]);
            }
        }
        HashSet<Integer> all=new HashSet<>();
        for(int x:nums){
            all.add(x);
        }
        return all.size()-exist.size();
    }
}