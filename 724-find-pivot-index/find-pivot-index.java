class Solution {
    public static int pivotIndex(int[] nums) {
        int rs = 0;
        for(int i : nums){
            rs += i;
        }

        int ls = 0;
        for(int i=0; i<nums.length; i++){
            rs -= nums[i];

            if(ls == rs){
                return i;
            }
            ls += nums[i];
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums = new int[100000];
        Scanner ob = new Scanner(System.in); 
        for(int i=0;i<nums.length;i++)
            nums[i]=ob.nextInt();
        System.out.println(pivotIndex(nums));
    }
}