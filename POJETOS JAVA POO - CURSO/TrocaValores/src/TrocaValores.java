public class TrocaValores {
    public static void main(String[] args) {

        int A = 19;
        int B = 23;

        System.out.println("Antes da troca:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);


        A = A + B;
        B = A - B;
        A = A - B;


        System.out.println("\nDepois da troca:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }
}