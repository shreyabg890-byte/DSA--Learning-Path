class Solution {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int st = 0;
        int end = s.length()-1;
        while(st<=end){
            if(s.charAt(st)!=s.charAt(end))
                return false;
            st++;
            end--;
        }
        return true;
    }
    public static void main(String[] args){
        String s ;
        Scanner ob = new Scanner(System.in);
        s = ob.nextLine();
        System.out.println(isPalindrome(s));
    }
}