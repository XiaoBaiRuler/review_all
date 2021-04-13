package DoubleSix;

import java.util.*;

/**
 * @Author xiaobai
 * @Date 2021/4/12 10:23
 * @Version 1.0
 */
public class DoubleSix18 {
    public static void main(String[] args) {
        int[] nums = {0, 0};
        System.out.println(largestNumber(nums));
    }
    public static String largestNumber(int[] nums) {
        ArrayList<String> list = new ArrayList<>();
        boolean flag = true;
        for (int i : nums){
            if (i != 0){
                flag = false;
            }
            list.add(Integer.toString(i));
        }
        if (flag){
            return "0";
        }
        list.sort((str1, str2) -> {
            int min = Math.min(str1.length(), str2.length());
            int i = 0;
            int item;
            while (i < min){
                item = str2.charAt(i) - str1.charAt(i);
                if (item != 0){
                    return item;
                }
                i ++;
            }
            if (str1.length() > min){
                int j = 0;
                while (i < str1.length()){
                    if (str1.charAt(i) < str1.charAt(j)){
                        return 1;
                    }
                    else if (str1.charAt(i) > str1.charAt(j)){
                        return -1;
                    }
                    j ++;
                    i ++;
                }
                i = 0;
                while (i < str2.length() && j < str1.length()){
                    if (str2.charAt(i) > str1.charAt(j)){
                        return -1;
                    }
                    else if (str2.charAt(i) < str1.charAt(j)){
                        return 1;
                    }
                    j ++;
                    i ++;
                }
            }
            else if (str2.length() > min){
                int j = 0;
                while (i < str2.length()){
                    if (str2.charAt(i) < str2.charAt(j)){
                        return -1;
                    }
                    else if (str2.charAt(i) > str2.charAt(j)){
                        return 1;
                    }
                    j ++;
                    i ++;
                }
                i = 0;
                while (i < str1.length() && j < str2.length()){
                    if (str1.charAt(i) > str2.charAt(j)){
                        return 1;
                    }
                    else if (str1.charAt(i) < str2.charAt(j)){
                        return -1;
                    }
                    j ++;
                    i ++;
                }
            }
            else{
                return 0;
            }
            return 0;
        });
        StringBuilder sb = new StringBuilder();
        list.forEach(sb::append);
        return sb.toString();
    }
}
