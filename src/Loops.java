public class Loops {
    public  static void main(String[] args) {
        System.out.println("Contando de 1 a 5 com for: ");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número:" + i);
        }
        System.out.println("Contando de 5 a 1 com while: ");
        int j = 5;
        while (j > 0) {
            System.out.println("Número: " + j);
            j--;
        }
    }
}
