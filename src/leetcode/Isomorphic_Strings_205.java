package leetcode;
import java.util.HashMap;
// 12. Isomorphic Strings
public class Isomorphic_Strings_205 {
    public static void main(String[] args) {
        // Hardcoded example strings
        String s = "egg";
        String t = "add";
        boolean result = areIsomorphic(s, t);
        if (result) {
            System.out.println("The strings are isomorphic.");
        } else {
            System.out.println("The strings are not isomorphic.");
        }
    }
    // Method to check if two strings are isomorphic
    public static boolean areIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (mp.containsKey(ch1)) {
                if (mp.get(ch1) != ch2) {
                    return false;
                }
            } else {
                if (mp.containsValue(ch2)) {
                    return false;
                }
                mp.put(ch1, ch2);
            }
        }
        return true;
    }
}
