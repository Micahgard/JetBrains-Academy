import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        // write a body here
        int[] myNum = {a, b, c};
        int max = myNum[0];
        int index = 0;
        for (int i = 0; i < myNum.length; i++) {
            if (max < myNum[i]) {
                max = myNum[i];
                index = i;
            }
        }
        return index + 1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}