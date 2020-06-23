import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int numberParts = scanner.nextInt();
        int bigger = 0;
        int smaller = 0;
        int perfect = 0;
        int temp;

        for (int i = 0; i < numberParts; i++) {
            temp = scanner.nextInt();
            if (temp == 1) {
                bigger++;
            } else if (temp == -1) {
                smaller++;
            } else {
                perfect++;
            }
        }
        System.out.print(perfect + " " + bigger + " " + smaller);
    }
}