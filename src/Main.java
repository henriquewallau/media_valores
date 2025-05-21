import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de números para calcular a média: ");
        int n = sc.nextInt();

        double soma = 0.0;
        for(int i=0; i<n; i++){
            System.out.print("Valor #" + (i+1) + ": ");
            double num = sc.nextDouble();
            soma += num;
        }
        double media = soma / n;
        System.out.printf("Média dos valores: %.2f" , media);
        sc.close();
    }
}