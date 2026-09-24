public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("Tampada: " + this.tampada);
    }


    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO NÃO POSSO RISCAR");
        } else {
            System.out.println("estou riscando");
        }
    }
    public void escrever(){
        this.tampada = false;
        System.out.println(" Hello world ");
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }
    public void pintar(){
        if(this.tampada == false){
            System.out.println("pintando um elefante");
        }else {
            System.out.println(" não posso pintar");
        }
    }
}
