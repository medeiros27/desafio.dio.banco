package one.digitalinnovation;

public class ContaPoupança extends Conta {

    public ContaPoupança(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("*** Extrato Conta Poupanca ***");
        super.imprimirInfosComuns();
    }



}
