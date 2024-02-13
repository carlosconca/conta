public class ContaPoupanca extends Conta {

    @java.lang.Override
    public void imprimirExtrato() {
        System.out.println("=== Imprimir Extrato Conta Poupanca.=== ");
        super.imprimirInfosComuns();
    }
}
