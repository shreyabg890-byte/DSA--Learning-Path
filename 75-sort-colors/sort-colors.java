class Solution {
    public static void sortColors(int[] nums) {
        int low=0,high=nums.length-1,mid=0,i;
        while(mid<=high){
            if(nums[mid]==0){
                int temp;
                temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }
            
            else if(nums[mid]==1){
                mid++;
            }
            else {
                int tem;
                tem=nums[high];
                nums[high]=nums[mid];
                nums[mid]=tem;
                high--;
                
            }
        }
        for( i=0;i<nums.length;i++)
            System.out.println(nums[i]);
    }
    public static void main(String[] args){
        int[] nums = new int[300];
        Scanner ob = new Scanner(System.in);
        for(int i=0;i<nums.length;i++)
            nums[i]=ob.nextInt();
        sortColors(nums);
    }
}