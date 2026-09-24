class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = (sum + nums[i]) % k;

            if(sum < 0){
                sum += k;
            }

            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        
        int res = 0;
        for(int key : map.keySet()){
            int m = map.get(key);
            
            if(m >= 2){
                res += (m * (m - 1)) / 2;
            }
        }
        return res;
    }
}