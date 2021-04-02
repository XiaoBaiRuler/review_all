package DoubleSix;

/**
 * @Author xiaobai
 * @Date 2021/4/1 20:01
 * @Version 1.0
 */
public class DoubleSix06 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if (clumsy(i) != clumsyChange(i)){
                System.out.println("error" + i);
                break;
            }
        }
        System.out.println("right");
    }

    public static int clumsy(int N) {
        int j = 0;
        int count = 0;
        int item = 0;
        for (int i = N; i > 0; i--) {
            if (j <= 2){
                if (j == 0){
                    item = i;
                    if (i != N){
                        item = - item;
                    }
                }
                else if (j == 1){
                    item *= i;
                }
                else{
                    item /= i;
                }
                j ++;
            }
            else{
                item += i;
                count += item;
                item = 0;
                j = 0;
            }
        }
        count += item;
        return count;
    }

    public static int clumsyChange(int N){
        int count = 0;
        if (N < 4){
            return getCount(N, N);
        }
        int x = N - N / 4 * 4;
        count += (N * (N - 1) / (N - 2));
        count += (N - 3);
        for (int i = N - 4; i > x; i -= 4) {
            count -= (i * (i - 1) / (i - 2));
            count += (i - 3);
        }
        count += getCount(x, N);
        return count;
    }

    private static int getCount(int x, int N){
        int item = 0;
        if (x > 0){
            item = x != N ? -x : x;
            x --;
        }
        if (x > 0){
            item *= x;
            x--;
        }
        if (x > 0){
            item /= x;
        }
        return item;
    }
}
