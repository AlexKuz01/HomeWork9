

public class HomeWork9 {
    public static void main(String[] args) {
        int shuttleNumber = 0;
        for (int i = 0; i < 100; i++) {
            int temp = shuttleNumber;
            shuttleNumber++;
            if (shuttleNumber % 10 == 4 || shuttleNumber % 10 == 9) {
                shuttleNumber++;

            }

            if ((shuttleNumber / 10) % 10 == 4 || (shuttleNumber / 10) % 10 == 9) {
                shuttleNumber = temp + 12;

            }
            System.out.print(shuttleNumber + " ");
        }

    }
}