import javax.swing.JOptionPane;

class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void deposito(double valorDeposito) {
        saldo += valorDeposito;
    }
}

public class Exer20 {
    public static void main(String[] args) {
        String valorStr = JOptionPane.showInputDialog("Indique seu saldo inicial: ");
        double valor = Double.parseDouble(valorStr);
        ContaBancaria contaBancaria = new ContaBancaria(valor);
        int n = Integer.parseInt(JOptionPane.showInputDialog("Indique o número de depósitos: "));
        for (int i = 0; i < n; i++) {
            String depositoString = JOptionPane.showInputDialog("Indique seu " + (i+1) +"º depósito!");
            double valorDeposito = Double.parseDouble(depositoString);
            contaBancaria.deposito(valorDeposito);
        }
        //double valorTotal = valor + valorDeposito;
        JOptionPane.showMessageDialog(null, "O valor da sua conta bancária é: R$" + contaBancaria.getSaldo());
        //JOptionPane.showMessageDialog(null, "O valor do seu depósito é: " + depositoString);
    }
}

