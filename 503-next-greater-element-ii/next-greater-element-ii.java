class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nge = new int[n];
        for(int i=0;i<n;i++){
            nge[i] = -1;
            for(int step=1;step<n;step++){
                int idx = (i+step)%n;
                if(nums[idx]>nums[i]){
                    nge[i]=nums[idx];
                    break;
                }
            }
        }
        return nge;
    }
    public void main(String[] args){
        int[] a=new int[1000];
        Scanner ob = new Scanner(System.in);
        for(int i=0;i<a.length;i++)
            a[i] = ob.nextInt();
        System.out.println(nextGreaterElements(a));
    }
}