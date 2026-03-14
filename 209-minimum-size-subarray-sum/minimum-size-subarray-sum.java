class Solution {
    public static int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0,sum=0;
        int min = Integer.MAX_VALUE;
        while(j<nums.length){
            sum+=nums[j];
            while(sum>=target){
                min=Math.min(min,j-i+1);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        return min == Integer.MAX_VALUE ?0:min;
    }
    public static void main(String[] args){
        int[] nums = new int[10000];
        Scanner ob=new Scanner(System.in);
        for(int i=0;i<nums.length;i++)
            nums[i]=ob.nextInt();
        int target = ob.nextInt();
        System.out.println(minSubArrayLen(target,nums));
    }
}