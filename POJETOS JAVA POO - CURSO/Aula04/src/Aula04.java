public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Faber",0.5f,"amarela");
        c1.status();
        System.out.println("------------------");
        Caneta c2 = new Caneta("bic",2.5f,"Preta");
        c2.status();
    }
}