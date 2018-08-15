package Homework.基础班.敖屹09;

public class Has22_More14 {
    public Has22_More14() {
    }

    public static boolean has22(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 2 && arr[i + 1] == 2) {
                return true;
            }
        }
        return false;
    }

    public static boolean more14(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 1) count++;
        }
        if (count > 4) return true;
        else return false;
    }
}
