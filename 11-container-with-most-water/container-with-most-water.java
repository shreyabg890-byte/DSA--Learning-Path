class Solution {
    public static int maxArea(int[] height) {
         int i = 0;
        int j = height.length - 1;
        int res = 0;

        while (i < j) {
            res = Math.max(res, (j - i) * Math.min(height[i], height[j]));
            if (height[i] < height[j]) i++;
            else j--;
        }

        return res;
    }
    public static void main(String[] args){
        int[] height = new int[10000];
        Scanner ob=new Scanner(System.in);
        for(int i=0;i<height.length;i++)
            height[i]=ob.nextInt();
        int res ;
        res=maxArea(height);
        System.out.println(res);
    }
}