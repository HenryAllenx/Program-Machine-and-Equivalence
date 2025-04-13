import java.util.Scanner;

public class recursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = scanner.nextInt();
        int soma = recursiveSum(n);
        System.out.println("Soma de 1 até " + n + ": " + soma);
    }

    public static int recursiveSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + recursiveSum(n - 1);
    }
}
