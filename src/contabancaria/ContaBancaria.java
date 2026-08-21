package contabancaria;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void mostrarSaldo() {
        IO.println("Saldo de " + titular + ": " + saldo);
    }
}
