import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String strLowerCase = str.toLowerCase();
        boolean startsWith = strLowerCase.startsWith("j");
        System.out.println(startsWith);
        }
    }
