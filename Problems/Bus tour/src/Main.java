import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int bridgeCount = scanner.nextInt();
        int count = 0;

        for (int i = 1; i < bridgeCount; i++) {
            int bridgeHeight = scanner.nextInt();

            if (busHeight >= bridgeHeight) {
                System.out.println("Will crash on bridge " + i);
                count++;
                break;
            }
        }

        if (count == 0) {
            System.out.println("Will not crash");
        }
    }
}