import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        for (int i = 0; i < 4; i++) {
            number = scanner.nextInt();
            System.out.print(--number + " ");
        }
    }
}