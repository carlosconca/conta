public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        cc.depositar(200);
        Conta poupanca = new ContaPoupanca();
        cc.transferir(90, poupanca);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
