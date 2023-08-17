
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero do final da sequencia");

        double num1 = scanner.nextInt();

        System.out.println("A seguência de numeros é ");

        for (int i = 1; i <= num1; i++) {
            System.out.println(i);
        }
        scanner.close();
    }
}
