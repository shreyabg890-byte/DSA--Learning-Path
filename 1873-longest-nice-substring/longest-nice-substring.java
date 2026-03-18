import java.util.*;

class Solution {

    public static String longestNiceSubstring(String s) {
        String ans = "";
        int maxlen = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {

                String sub = s.substring(i, j + 1);

                if (niceString(sub)) {
                    if (sub.length() > maxlen) {
                        maxlen = sub.length();
                        ans = sub;
                    }
                }
            }
        }
        return ans;
    }

    public static boolean niceString(String s) {
        Set<Character> set = new HashSet<>();

        // store all characters
        for (char c : s.toCharArray()) {
            set.add(c);
        }

        // check condition
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                if (!set.contains(Character.toUpperCase(c))) {
                    return false;
                }
            } else {
                if (!set.contains(Character.toLowerCase(c))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String s = ob.nextLine();
        System.out.println(longestNiceSubstring(s));
    }
}