import java.util.Scanner;
class Solution {
    public void moveZeroes(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==0){
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        for(int i=0 ; i<nums.length;i++)
            System.out.println(nums[i]+",");
    }

    public static void main(String[] args){
        int[] nums=new int[5];
        Scanner ob = new Scanner(System.in);
        for(int i=0;i<nums.length;i++)
            nums[i]=ob.nextInt();
    }
}