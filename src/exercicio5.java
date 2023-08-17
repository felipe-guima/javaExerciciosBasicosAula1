
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero que deseja verificar se é par ou impar");

        int num1 = scanner.nextInt();

        if (num1 % 2 == 0) {
            System.out.println(" O numero digitado é par !!");
        } else {
            System.out.println(" O numero digitado é impar !!");
        }
        scanner.close();
    }
}
