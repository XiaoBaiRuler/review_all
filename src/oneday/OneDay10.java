package oneday;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author xiaobai
 * @Date 2021/2/27 12:43
 * @Version 1.0
 */
public class OneDay10 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 3};
        System.out.println(containsNearbyDuplicate(nums, 2));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> hashMap = new HashMap<>(16);
        for (int i = 0; i < nums.length; i++) {
            if (!hashMap.containsKey(nums[i])){
                hashMap.put(nums[i], i);
            }
            else{
                if (Math.abs(hashMap.get(nums[i]) - i) <= k){
                    return true;
                }
                else{
                    hashMap.put(nums[i], i);
                }
            }
        }
        return false;
    }
}
