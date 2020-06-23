import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int divisor = scanner.nextInt();
        int temp = 0;

        for (int i = start; i <= end; i++) {
            if (i % divisor == 0) {
                temp++;
            }
        }
        System.out.println(temp);
    }
}