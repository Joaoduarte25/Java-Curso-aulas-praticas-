public class SomaProduto {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int somaPares = 0;
        int produtoImpares = 1;

        for (int num : array) {
            if (num % 2 == 0) {
                somaPares += num;
            } else {
                produtoImpares *= num;
            }
        }

        System.out.println("Soma dos pares: " + somaPares);
        System.out.println("Produto dos ímpares: " + produtoImpares);
    }
}