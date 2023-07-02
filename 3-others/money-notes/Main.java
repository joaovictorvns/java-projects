import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] values = {100, 50, 20, 10, 5, 2};
        
        System.out.print("Digite o valor: ");
        int n = Integer.parseInt(scanner.nextLine());

        for(int i : values) {
            System.out.printf("%d nota(s) de R$ %d,00\n", n/i, i);
            n %= i;
        }
        System.out.printf("%d nota(s) de R$ 1,00\n", n);
        scanner.close();
    }
}