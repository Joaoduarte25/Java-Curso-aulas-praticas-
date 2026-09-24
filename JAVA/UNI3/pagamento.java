package JAVA.UNI3;

abstract class Pagamento {

    protected double valor;

    protected String dataPagamento;

 

    public Pagamento(double valor, String dataPagamento) {

        this.valor = valor;

        this.dataPagamento = dataPagamento;

    }

 

    public abstract void processarPagamento();

}

 

// Cartão de Crédito

class CartaoCredito extends Pagamento {

    public CartaoCredito(double valor, String dataPagamento) {

        super(valor, dataPagamento);

    }

 

    @Override

    public void processarPagamento() {

        System.out.println("Processando pagamento via Cartão de Crédito no valor de R$ " + valor);

    }

}

 

// Pix

class Pix extends Pagamento {

    public Pix(double valor, String dataPagamento) {

        super(valor, dataPagamento);

    }

 

    @Override

    public void processarPagamento() {

        System.out.println("Processando pagamento via Pix no valor de R$ " + valor);

    }

}
