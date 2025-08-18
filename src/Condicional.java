import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 12) {
            System.out.println("Voce é uma criança");
        }  else if (idade < 18) {
            System.out.println("Voce é adolescente.");
        } else {
            System.out.println("Voce é adulto");
        }
        scanner.close();
    }
}
