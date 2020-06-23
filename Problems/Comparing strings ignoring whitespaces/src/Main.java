import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //user input
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        //removes whitespaces
        String noWhitespaces1 = str1.replace(" ", "");
        String noWhitespaces2 = str2.replace(" ", "");
        //compares
        boolean equal = noWhitespaces1.equals(noWhitespaces2);
        System.out.println(equal);

    }
}
