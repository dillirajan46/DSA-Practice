class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Map<Integer,Integer>mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                int a = mp.get(nums[i]);
                int b = i;
                int abs = Math.abs(a-b);
                if(abs<=k){
                    return true;
                }
                else{
                    mp.remove(nums[i]);
                    mp.put(nums[i],i);
                }
            }
            else{
                mp.put(nums[i],i);
            }
        }
    return false;
    }
}