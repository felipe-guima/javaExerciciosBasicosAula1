import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero final da seguência de numeros primos");

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= num; i++) {

            boolean ehPrimo = true;

            for (int j = 2; j * j <= i; j++) {

                if (i % j == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo) {
                System.out.print(i + " ");
            }
        }
    }
}
