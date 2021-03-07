package oneday;

/**
 * @Author xiaobai
 * @Date 2021/3/7 9:33
 * @Version 1.0
 */
public class OneDay16 {
    public static void main(String[] args) {
        int[][] points = {
                {3, 4}
        };
        System.out.println(nearestValidPoint(3, 4, points));
    }
    public static int nearestValidPoint(int x, int y, int[][] points) {
        int item = 0;
        int result = Integer.MAX_VALUE;
        int j = -1;
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] == x || points[i][1] == y){
                item = Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y);
                if (item == 0){
                    return i;
                }
                else{
                    if (item < result){
                        j = i;
                        result = item;
                    }
                    else if (item == result && (points[j][0] + points[j][1]) > (points[i][0] + points[i][1])){
                        j = i;
                    }
                }
            }
        }
        return j;
    }
}
