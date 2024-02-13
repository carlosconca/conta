public class ContaCorrente extends Conta {

    @java.lang.Override
    public void imprimirExtrato() {
        System.out.println("Imprimir Extrato Conta Corrente.");
        super.imprimirInfosComuns();
    }
}
