import java.util.Scanner;
class Solution {
    public void reverseString(char[] s) {
      int i=0;
      int j=s.length-1;
      while(i<j){
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        i++;
        j--;
      }
      for(i=0;i<s.length;i++){
        System.out.println(s[i]);
      }
    }
    public static void main(String[] args){
        Scanner ob = new Scanner (System.in);
        String s;
        s=ob.nextLine();
        Solution sol=new Solution();
        sol.reverseString(s.toCharArray());
    }
}