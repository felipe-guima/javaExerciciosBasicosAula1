
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 3 numeros para verificar a média ");

        double num1 = scanner.nextInt();
        double num2 = scanner.nextInt();
        double num3 = scanner.nextInt();

        double media = (num1 + num2 + num3) / 3;

        System.out.println(" A média dos numeros é " + media);
        scanner.close();
    }
}
