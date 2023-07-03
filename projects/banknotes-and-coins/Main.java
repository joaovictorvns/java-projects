import java.util.Scanner;

public class Main {
    static int n;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        
        n = (int) (Double.parseDouble(scanner.nextLine())*100);
        int[] values1 = {10000, 5000, 2000, 1000, 500, 200};
        int[] values2 = {100, 50, 25, 10, 5, 1};
        
        calcDisplay("nota", values1);
        calcDisplay("moeda", values2);
        scanner.close();
    }
    
    private static void calcDisplay(String form, int[] values) {
        System.out.println(form.toUpperCase()+"S:");
        for(int i : values) {
            System.out.printf("%d %s(s) de R$ %.2f\n", n/i, form, i/100.0);
            n %= i;
        }
    }   
}