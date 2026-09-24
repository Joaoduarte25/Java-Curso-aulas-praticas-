public class Fibonacci {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;

        System.out.println(a);
        System.out.println(b); 

        int proximo = a + b;

        while (proximo <= 100) {
            System.out.println(proximo);
            a = b;
            b = proximo;
            proximo = a + b;
        }
    }
}