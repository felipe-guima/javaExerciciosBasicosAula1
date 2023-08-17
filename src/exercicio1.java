import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 2 numeros no terminal para soma-los");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int soma = num1 + num2;
        System.out.println("A soma dos numeros é " + soma);

        scanner.close();
    }
}
