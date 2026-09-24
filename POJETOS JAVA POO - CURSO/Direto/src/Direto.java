import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Direto {
    public static void main(String[] args) {
        try {
            long inicio = System.currentTimeMillis();

            File arquivo = new File("C:\\Users\\joaos\\Documents\\FACULDADE - ADS\\Terceiro semestre\\SISTEMAS OPERACIONAIS\\dados.txt.txt");

            Scanner ler = new Scanner(arquivo);
            Scanner teclado = new Scanner(System.in);

            ArrayList<String> linhas = new ArrayList<>();

            while (ler.hasNextLine()) {
                linhas.add(ler.nextLine());
            }

            System.out.print("Digite o número da linha: ");
            int numero = teclado.nextInt();

            System.out.println("Linha escolhida: " + linhas.get(numero - 1));

            ler.close();
            teclado.close();

            long fim = System.currentTimeMillis();

            System.out.println("Tempo de execução: " + (fim - inicio) + " ms");

        } catch (Exception e) {
            System.out.println("Erro ao abrir o arquivo: " + e.getMessage());
        }
    }
}