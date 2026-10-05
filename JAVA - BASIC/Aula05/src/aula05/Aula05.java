
package aula05;
public class Aula05 {
    public static void main(String[] args) {
        
        ContaBanco p1 = new ContaBanco();
        
        p1.setNumConta(1239);
        p1.setDono("Emilly");
        p1.abrirConta("CP");
        
        ContaBanco p2 = new ContaBanco();
        
        p2.setNumConta(3131);
        p2.setDono("clodoaldo");
        p2.abrirConta("CC");
        
        ContaBanco p3 = new ContaBanco();
        
        p3.setNumConta(5151);
        p3.setDono("Duarte");
        p3.abrirConta("CC");
        
        ContaBanco p4 = new ContaBanco();
        
        p4.setNumConta(0020);
        p4.setDono("Gustavo");
        p4.abrirConta("CP");
        
        //depositar
        
        p1.depositar(100);
        p2.depositar(500);
        p3.depositar(70);
        p4.depositar(250);
        
        //sacar
        
        p1.sacar(25);
        p2.sacar(150);
        p3.sacar(7);
        p4.sacar(50);
        
        //fechar conta
        
        p1.sacar(225);
        p1.fecharConta();
        
        // status
        
        p1.estadoAtual();
        p2.estadoAtual();
        p3.estadoAtual();
        p4.estadoAtual();
       
    }
}
