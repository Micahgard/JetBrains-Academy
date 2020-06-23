import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            sum += input;
            if (sum >= 1000) {
                int calc = sum - 1000;
                System.out.println(calc);
                break;
            }
            if (input == 0 && sum < 1000) {
                System.out.println(sum);
                break;
            }
        }
    }
}