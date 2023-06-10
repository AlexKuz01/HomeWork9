
import java.util.Arrays;

public class HomeWork9 {
    public static void main(String[] args) {
        int[] shuttles = new int[100];
        int a;
        int b;
        int c = 0;
        for (int i = 0, j = 1; j <= shuttles.length+c; j++) {
            a = j % 10;
            b = j / 10;
            if (a != 4 && b != 4 && a != 9 && b != 9) {
                shuttles[i++] = j;
            }else {
                c++;
            }
        }

        System.out.println("Номера шатлов " + Arrays.toString(shuttles));
    }
}
