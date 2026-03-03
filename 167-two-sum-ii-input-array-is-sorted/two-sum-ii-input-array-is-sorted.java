
class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    return new int[]{i+1,j+1}; // Create a new array, store the value and return the array
                }
                
            }
        }
        return new int[]{-1,-1}; // if not found
    }
    public static void main(String[] args){
        int[] numbers=new int[6];
        Scanner ob = new Scanner(System.in);
        for(int i=0;i<numbers.length;i++){
            numbers[i]=ob.nextInt();
        }
        int target;
        target=ob.nextInt();
        System.out.println(twoSum(numbers,target));
        
    }
}