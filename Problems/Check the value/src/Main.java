import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        boolean check = false;
        if (input < 10) check = true;
        System.out.println(check);
    }
}