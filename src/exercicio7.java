import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // cada termo subsequente corresponde a soma dos dois números anteriores
        System.out.println("Digite o numero da seguencia de Fibonatti.");

        int num = Integer.parseInt(scanner.nextLine());

        int a = 0;
        int b = 1;

        for (int i = 0; i <= num; i++) {

            System.out.println(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        scanner.close();

    }
}
