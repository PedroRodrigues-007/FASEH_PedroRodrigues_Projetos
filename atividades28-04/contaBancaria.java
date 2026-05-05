class ContaBancaria {
    String titular;
    double saldo;

    void depositar(double valor) {
        saldo += valor;
    }

    void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    void mostrarSaldo() {
        System.out.println("Saldo: R$ " + saldo);
    }
}

public class contaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Maria";
        conta.saldo = 1000;

        conta.depositar(500);
        conta.sacar(300);
        conta.sacar(1500);

        conta.mostrarSaldo();
    }
}
