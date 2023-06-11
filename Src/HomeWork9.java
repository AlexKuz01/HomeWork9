

public class HomeWork9 {
    public static void main(String[] args) {
        for (int shuttleNumber = 1; shuttleNumber < 100; shuttleNumber++) {
            if (shuttleNumber % 10 != 4 && shuttleNumber % 10 != 9 && shuttleNumber / 10 != 4 && shuttleNumber / 10 != 9) {
                System.out.print(shuttleNumber + " ");
            }
        }


    }
}
