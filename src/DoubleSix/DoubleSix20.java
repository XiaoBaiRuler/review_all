package DoubleSix;

/**
 * @Author xiaobai
 * @Date 2021/4/14 8:25
 * @Version 1.0
 */
public class DoubleSix20 {

    public static void main(String[] args) {
        int[] nums = {5,5,5,10,20};
        System.out.println(lemonadeChange(nums));
    }

    public static boolean lemonadeChange(int[] bills) {
        if (bills.length == 0){
            return true;
        }
        if (bills[0] > 5){
            return false;
        }
        int i = 1;
        int j = 0;
        int k = 0;
        for (int l = 1; l < bills.length; l++) {
            if (bills[l] == 5){
                i ++;
                bills[l] = -1;
            }
            else if (bills[l] == 10){
                if (i == 0){
                    return false;
                }
                j ++;
                i --;
                bills[l] = -1;
            }
            else{
                if (i == 0){
                    return false;
                }
                if (i < 3){
                    if (j == 0){
                        return false;
                    }
                    else{
                        i --;
                        j --;
                        k ++;
                        bills[l] = -1;
                    }
                }
                else{
                    if (j == 0){
                        i -= 3;
                    }
                    else{
                        j --;
                        i --;
                    }
                    k ++;
                    bills[l] = -1;
                }
            }
        }
        return bills[bills.length - 1] == -1;
    }
}
