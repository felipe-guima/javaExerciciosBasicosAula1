import java.util.Scanner;

public class exercico10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero para o qual deseja exibir a tabuada.");

        int num = Integer.parseInt(scanner.nextLine());
        if (num > 0) {
            for (int i = 0; i <= 10; i++) {
                int res = num * i;
                System.out.println(num + " x " + i + " = " + res);
            }
        } else {
            System.out.println("O numero precisa ser maior que 0. ");
        }
        scanner.close();
    }

}
