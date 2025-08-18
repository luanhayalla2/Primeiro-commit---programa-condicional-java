import java.util.ArrayList;

public class EstruturaDados {
    public static void main(String[] args) {
        //Array simples
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Array tradicional:");
        for (int n : numeros){
            System.out.println(n + " ");
        }

        // ArrayList (estrutura dinamica)
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Joao");
        nomes.add("Maria");
        nomes.add("Ana");

        System.out.println("\nArrayList de nomes:");
        for (String nome : nomes){
            System.out.println(nome + " ");
        }

    }
}
