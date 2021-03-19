package oneday;

/**
 * @Author xiaobai
 * @Date 2021/3/19 9:59
 * @Version 1.0
 */
public class OneDay33 {
    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        System.out.println(parkingSystem.addCar(1));
        System.out.println(parkingSystem.addCar(2));
        System.out.println(parkingSystem.addCar(3));
        System.out.println(parkingSystem.addCar(1));
    }
}
class ParkingSystem {
    private int big;
    private int medium;
    private int small;
    private boolean flag;
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1){
            flag = big > 0;
            big --;
            return flag;
        }
        if (carType == 2){
            flag = medium > 0;
            medium --;
            return flag;
        }
        if (carType == 3){
            flag = small > 0;
            small --;
            return flag;
        }
        return false;
    }
}