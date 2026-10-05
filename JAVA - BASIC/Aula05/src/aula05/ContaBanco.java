package aula05;
public class ContaBanco {
    // atributos
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    // metodos person
    
    public void estadoAtual(){
        System.out.println("------------------------------");
        System.out.println("CONTA: " + this.getNumConta());
        System.out.println("TIPO: " + this.getTipo());
        System.out.println("DONO: " + this.getDono());
        System.out.println("SALDO: " + this.getSaldo());
        System.out.println("STATUS: " + this.getStatus());
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta Aberta com sucesso");
        
    }
    public void fecharConta(){
        if(this.getSaldo()>0){
            System.out.println("conta não pode ser fechada, tem dinheiro dentro");
        }else if (this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechada pos tem debito");
        } else {
            this.setStatus(false);
            System.out.println("conta fechada com sucesso");
        }
    }
    public void depositar (float v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("deposito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossivel depositar em uma conta fecada");
        }
    }
    public void sacar(float v){
        if (this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("saldo insulficiente para sacar");
            }
        }else {
            System.out.println("Impossivel Sacar de uma conta fecahda");
        }
    }
    public void pagarMensal(){
        int v;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus ()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else{
           System.out.println("impossivel pagar com a conta fechada");
        }
    }
    
    //metodos espe
    
    public ContaBanco(){
        this.saldo=0;
        this.status=false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
    
