class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nG = new int[10001];              // nG = nextGreater
        Stack<Integer>stack = new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=nums2[i]){
                stack.pop();
            }
            nG[nums2[i]] = stack.isEmpty()? -1 : stack.peek();
            stack.push(nums2[i]);
        }
        for(int i=0; i<nums1.length;i++){
            nums1[i]=nG[nums1[i]];
        }
        return nums1;
    }
    public void main(String[] args){
        int[] num1 = new int[1000];
        int[] num2 = new int[1000];
        Scanner ob = new Scanner(System.in);
        for(int i=0 ; i<num1.length;i++)
            num1[i]=ob.nextInt();
        for(int i=0;i<num2.length;i++)
            num2[i]=ob.nextInt();
        System.out.println(nextGreaterElement(num1,num2));
    }
}