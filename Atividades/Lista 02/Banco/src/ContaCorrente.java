import java.util.Scanner;

public class ContaCorrente {
    private double saldo;
    private String numeroConta;
    private String CPF;
    private String senha;
    private String PIX;

    public ContaCorrente(String numeroConta, String CPF, String senha, String PIX) {
        this.numeroConta = numeroConta;
        this.CPF = CPF;
        this.senha = senha;
        this.PIX = PIX;
        this.saldo = 0.0;
    }

    public void transferir(double valor, String PIX) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Transferência realizada com sucesso! Valor: " + valor + ", para o PIX: " + PIX);
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência.");
        }
    }

    public void verSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }

    public boolean realizarLogin(String CPF, String senha) {
        if (CPF.equals(this.CPF) && senha.equals(this.senha)) {
            return true;
        } else {
            return false;
        }
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Deposito de valor "+valor+" feito com sucesso");
        System.out.println("Valor total da conta: "+saldo);
    }

    public void sacar(double valor){
        if(saldo>=valor) {
            saldo-=valor;
            System.out.println("Saldo total da conta após deposito: "+saldo);
        } else System.out.println("Saldo insuficiente");
    }
}
