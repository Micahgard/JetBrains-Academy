import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextLong();
        long fact = 1;
        int i;

        while (fact <= input) {
            for (i = 1; i <= input; i++) {
                fact = fact * i;
            }
        }
        System.out.println(fact);
    }
}