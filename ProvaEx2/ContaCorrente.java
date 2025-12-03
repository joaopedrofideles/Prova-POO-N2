package ProvaEx2;


public class ContaCorrente implements Conta {

    private double saldo;
    private final double taxa = 0.20;

    public ContaCorrente(double saldoInicial) {
        this.saldo = saldoInicial;
    }


    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        double total = valor + (valor * taxa);

        if (valor > 0 && total <= saldo) {
            saldo = saldo - total;
        } else {
            System.out.println("Valor inválido ou saldo insuficiente.");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            double liquido = valor - (valor * taxa);
            saldo = saldo + liquido;
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public String toString() {
        return "ContaPoupança: (saldo=" + saldo + ")";
    }
}

