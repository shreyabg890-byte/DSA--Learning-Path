class Solution {
    public static double findMaxAverage(int[] nums, int k) {
        double sum=0,result;
        for (int i=0;i<k;i++){
            sum+=nums[i];
        }
        result=sum;
        for(int i=k;i<nums.length;i++){
            sum += nums[i]-nums[i-k];
            result=Math.max(sum,result);
        }
        return result/k;
    }
    public static void main(String[] args){
        int[] nums = new int[10000];
        Scanner ob = new Scanner(System.in);
        for(int i=0;i<nums.length;i++)
            nums[i]=ob.nextInt();
        int k = ob.nextInt();
        double res = findMaxAverage(nums,k);
        System.out.println(res);
    }
}