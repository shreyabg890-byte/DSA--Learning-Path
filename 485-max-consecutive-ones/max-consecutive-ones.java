class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int cur=0;
        for(int i=0;i<nums.length;i++){
            
            if (nums[i]==1){
                    cur += 1;
                    max = Math.max(max,cur);
                }
                    
                else{
                    cur=0;
                }
            
            
        }
        return max;
    }
    public static void main(String[] args){
        int[] nums = new int[100];
        Scanner ob = new Scanner(System.in);
        for(int i=0;i<nums.length;i++)
            nums[i]=ob.nextInt();

        System.out.println(findMaxConsecutiveOnes(nums));
    }
}