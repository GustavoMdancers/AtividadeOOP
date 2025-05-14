public class Main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria(1001, "Gustavo", 500.0);
        System.out.println("Saldo inicial R$: " + c1.getSaldo());
        c1.depositar(200.0);
        System.out.println("Saldo após depósito de R$200.00 = R$: " + c1.getSaldo());
        c1.sacar(100.0);
        System.out.println("Saldo após saque de R$100.00 = R$: " + c1.getSaldo());

        ContaBancaria c2 = new ContaBancaria(1002, "Ana", 1000.0);
        System.out.println("Saldo inicial R$: " + c2.getSaldo());
        c2.depositar(300.0);
        System.out.println("Saldo após depósito de R$300.00 = R$: " + c2.getSaldo());
        c2.sacar(1500.0);
        System.out.println("Saldo após saque de R$1500.00 = R$: " + c2.getSaldo());
    }
}