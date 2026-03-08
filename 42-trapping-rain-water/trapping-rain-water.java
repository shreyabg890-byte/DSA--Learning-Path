class Solution {
    public static int trap(int[] height) {
        int l=0,r=height.length-1,lm=0,rm=0,total=0;
        while(l<r){
            if(height[l]<=height[r]){
                if(lm<=height[l]){
                    lm=height[l];
                    
                }
                else{
                    total+=(lm-height[l]);
                }
                l++;
            }
            else{
                if(rm<height[r]){
                    rm=height[r];
                    
                }
                else{
                    total+=(rm-height[r]);
                }
                r--;
            }
        }
        return total;
    }
    public static void main(String[] args){
        int[] height=new int[1000];
        Scanner ob = new Scanner(System.in);
        for(int i=0;i<height.length;i++)
            height[i]=ob.nextInt();
        int res = trap(height);
        System.out.println(res);
    }
}