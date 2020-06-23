import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int total = 0;
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < i; j++) {
                total++;
                if (total <= input)
                    System.out.print(i + " ");
                if (i == j) {
                    break;
                }
            }
        }
    }
}