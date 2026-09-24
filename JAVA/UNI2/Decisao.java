import java.util.Scanner;

public class Decisao {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um numero: ");

    int numero = s.nextInt();

    if (numero > 0) {

        System.out.println("O numero é positivo." + numero);
    }else if (numero < 0) {

        System.out.println("O numero é negativo." + numero);        
    }else {

        System.out.println("O numero é zero." + numero);
    }
        System.out.println("fim do programa.");

    }
}
