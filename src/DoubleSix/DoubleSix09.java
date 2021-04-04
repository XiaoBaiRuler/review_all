package DoubleSix;

import java.util.*;

/**
 * @Author xiaobai
 * @Date 2021/4/3 19:44
 * @Version 1.0
 */
public class DoubleSix09 {

    public static void main(String[] args) {
        String pattern = "abba";
        String str = "dog dog dog dog";
        System.out.println(wordPattern(pattern, str));
    }

    public static boolean wordPattern(String pattern, String s) {
        if (pattern == null && s == null){
            return true;
        }
        else if (pattern == null || s == null){
            return false;
        }
        int all = pattern.length();
        String[] words = s.split(" ");
        if (words.length != all){
            return false;
        }
        HashMap<Character, String> hashMap = new HashMap<>(16);
        HashMap<String, Character> hash = new HashMap<>(16);
        for (int i = 0; i < all; i++) {
            Character c = pattern.charAt(i);
            if (!hashMap.containsKey(c)){
                hashMap.put(c, words[i]);
            }
            else {
                if (!hashMap.get(c).equals(words[i])){
                    return false;
                }
            }
            if (!hash.containsKey(words[i])){
                hash.put(words[i], c);
            }
            else{
                if (!hash.get(words[i]).equals(c)){
                    return false;
                }
            }
        }
        return true;
    }
}
