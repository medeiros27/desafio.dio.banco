package one.digitalinnovation;

public class Main {

    public static void main(String[] args) {

        Cliente Bruno = new Cliente();
        Bruno.setNome("Bruno Medeiros");

        Conta cc = new ContaCorrente(Bruno);
        cc.depositar(1000);



        Conta cp = new ContaPoupança(Bruno);
        cp.depositar(400);
        cc.transferir(200, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
