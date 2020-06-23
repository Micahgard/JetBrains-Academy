import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = 1;
        int square = 1;
        while (square <= n) {
            square = num * num;
            if (square > n) {
                break;
            }
            System.out.println(square);
            num++;
        }
    }
}