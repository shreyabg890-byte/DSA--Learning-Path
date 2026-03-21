class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer>map=new HashMap<>();
        int cnt=0;
        int pre_sum = 0 ;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            pre_sum += nums[i];
            int remove = pre_sum-k;
            if(map.containsKey(remove)){
                cnt += map.get(remove);
            }
            map.put(pre_sum,map.getOrDefault(pre_sum,0)+1);
        }
        return cnt;
    }
    public void main(String[] args){
        int[] a = new int[10000];
        Scanner ob= new Scanner(System.in);
        for(int i =0 ;i<a.length;i++)
            a[i] = ob.nextInt();
        int k = ob.nextInt();
        System.out.println(subarraySum(a,k));
    }
}
