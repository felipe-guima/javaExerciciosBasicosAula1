import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalIdades = 0;

        System.out.println("Quantas pessoas deseja inserir ? ");
        int qPessoas = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= qPessoas; i++) {

            System.out.println("Digite o nome da pessoa " + i + ": ");
            String nome = scanner.nextLine();

            System.out.println("Digite a idade de " + nome + ": ");
            int idade = Integer.parseInt(scanner.nextLine());

            totalIdades += idade;
        }

        if (qPessoas > 0) {
            double mediaIdade = (double) totalIdades / qPessoas;
            System.out.println("A média das idades é: " + mediaIdade);
        } else {
            System.out.println("Nenhuma idade foi inserida.");
        }
        scanner.close();
    }
}
