import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero no terminal");

        int num1 = scanner.nextInt();

        if (num1 < 0) {
            System.out.println("O numero digitado é negativo.");
        }

        else if (num1 == 0) {
            System.out.println("O numero digitado é igual a 0.");
        }

        else if (num1 > 0) {
            System.out.println("O numero digitado é positivo.");
        }
        scanner.close();
    }
}
