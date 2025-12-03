package ProvaEx2;


public class ContaPoupanca implements Conta {

    private double saldo;

    public ContaPoupanca(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
        } else {
            System.out.println("Valor inválido ou saldo insuficiente.");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public String toString() {
        return "ContaPoupança: (saldo=" + saldo + ")";
    }
}

