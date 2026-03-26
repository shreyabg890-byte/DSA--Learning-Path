class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int n= nums.length;
        int a1=helper(n,k,nums);
        int a2=helper(n,k-1,nums);
        return a1-a2;
    }
    public int helper(int n, int k, int nums[]){
        int i=0,j=0,cnt=0;
        HashMap<Integer,Integer> hm = new HashMap();
        while(j<n){
            hm.put(nums[j],hm.getOrDefault(nums[j],0)+1);
            while(hm.size()>k){
                hm.put(nums[i],hm.get(nums[i])-1);
                if (hm.get(nums[i])==0){
                    hm.remove(nums[i]);
                }
                i++;

            }
            cnt += j-i+1;
            j++;
        }
        return cnt;
    }
}