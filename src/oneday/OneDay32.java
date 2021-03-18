package oneday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author xiaobai
 * @Date 2021/3/18 9:28
 * @Version 1.0
 */
public class OneDay32 {

    public static void main(String[] args) {
        int[] candidates = {1, 2, 3, 6, 7};
        System.out.println(combinationSum(candidates, 7));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        int i = candidates.length - 1;
        while(i >= 0 && candidates[i] > target){
           i --;
        }
        List<List<Integer>> result = new ArrayList<>();
        if (i == -1){
           return result;
        }
        if (candidates[i] == target){
           List<Integer> list = new ArrayList<>();
           list.add(target);
           result.add(list);
           i --;
        }
        // 回溯法
        System.out.println(i);
        ArrayList<Integer> track = new ArrayList<>();
        back(candidates, target, result, track, 0, i + 1);
        return result;
    }

    private static void back(int[] candidates, int target, List<List<Integer>> result, ArrayList<Integer> track, int i,
                             int all){
        if (i == all){
            return;
        }
        if (target == 0){
            result.add(new ArrayList<>(track));
            return;
        }
        back(candidates, target, result, track, i + 1, all);
        if (target - candidates[i] >= 0){
            track.add(candidates[i]);
            back(candidates, target - candidates[i], result, track, i, all);
            track.remove(track.size() - 1);
        }
    }
}
