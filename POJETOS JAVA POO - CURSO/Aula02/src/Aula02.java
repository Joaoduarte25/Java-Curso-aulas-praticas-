public class Aula02 {
        public static void main(String[] args) {
                Caneta c1 = new Caneta();
                c1.cor = "Azul";
                c1.ponta = 0.5f;
                c1.destampar();
                c1.modelo = "Bic";
                c1.carga = 100;
                c1.rabiscar();
                c1.status();

                System.out.println(" ");

                Caneta c2 = new Caneta();
                c2.modelo = "Faber";
                c2.cor = "Verde";
                c2.ponta = 0.5f;
                c2.carga = 50;
                c2.tampar();
                c2.rabiscar();
                c2.status();

        }
}