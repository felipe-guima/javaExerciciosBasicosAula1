
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 3 numeros para verificar o maior");

        int maior = 0;
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            maior = num1;
        }

        else if (num2 > num1 && num2 > num3) {
            maior = num2;
        }

        else if (num3 > num1 && num3 > num2) {
            maior = num3;
        }

        System.out.println(" O maior numero é " + maior);
        scanner.close();
    }
}
