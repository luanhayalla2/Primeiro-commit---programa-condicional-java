import java.util.Scanner;

public class CondicionalComLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "s"; // variável de controle

        while (continuar.equalsIgnoreCase("s")) {
            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            if (idade < 12) {
                System.out.println("Você é uma criança.");
            } else if (idade < 18) {
                System.out.println("Você é adolescente.");
            } else if (idade < 60) {
                System.out.println("Você é adulto.");
            } else {
                System.out.println("Você é idoso.");
            }

            System.out.print("\nDeseja continuar? (s/n): ");
            continuar = scanner.next(); // lê a resposta
            System.out.println("----------------------------");
        }

        System.out.println("Programa encerrado!");
        scanner.close();
    }
}
