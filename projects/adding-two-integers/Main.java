import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o segundo número: ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.printf("%d+%d=%d", a, b, a+b);

        scanner.close();
    }
}