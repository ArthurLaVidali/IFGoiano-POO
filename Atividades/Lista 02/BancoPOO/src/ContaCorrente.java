public class ContaCorrente {

    //Define todas os atributos como privados....
    private double saldo;  //Define saldo como double e privado
    private int numeroConta; //Conta como numero inteiro e privado

    //cpf, senha e pix como String e privado
    private String cpf;
    private String senha;
    private String pix;

    public ContaCorrente(double saldo, int numeroConta, String cpf, String senha, String pix) {
        this.saldo = saldo;
        this.numeroConta = numeroConta;
        this.cpf = cpf;
        this.senha = senha;
        this.pix = pix;  //Criação de conta e definição dos valores
    }

    public double getSaldo() {  //Recebe o Saldo, e apresenta o saldo ao usuário quando for solicitado
        return saldo;
    }

    public int getNumeroConta() {  //Recebe o numero da conta.
        return numeroConta;
    }

    public String getCPF() {  //Recebe o numero do CPF
        return cpf;
    }

    public String getSenha() { //Recebe a senha
        return senha;
    }

    public String getPIX() { //recebe o pix do usuário
        return pix;
    }

    public void depositar(double valor) {  //Quando o usuário solicitar um deposito, será feito aqui
        saldo += valor;
    }

    public void sacar(double valor) { //Quando o usário solicita o saque
        if (valor <= saldo) {   //verifica se o saldo é suficiente para o saque
            saldo -= valor;
        } else {   //Se o saldo for insuficiente
            System.out.println("Saldo insuficiente.");
        }
    }

    public void transferir(double valor, String pix) { //Quando o usuário solicita transferencia
        if (valor <= saldo) {  //verifica se o saldo é suficiente para transferencia
            saldo -= valor;
            System.out.println("Transferência realizada para o PIX " + pix + ".");
        } else { //Se o saldo for insuficiente
            System.out.println("Saldo insuficiente.");
        }
    }

    public static boolean validarCPF(String cpf) {  //Validação do CPF
        if (cpf == null || cpf.length() != 11) {  //Verifica seu o cpf tem 11 digitos
            return false;
        }

        int[] digits = cpf.chars().map(Character::getNumericValue).toArray();  //Transforma a variavel do cpf em uma arrayList
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            sum += digits[i] * (10 - i);
        }  //Verificação do CPF é valido

        int firstDigit = sum % 11;
        firstDigit = firstDigit < 2 ? 0 : 11 - firstDigit;  //Verificação do CPF é valido

        if (digits[9] != firstDigit) {
            return false;
        }  //Verificação do CPF é valido

        sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += digits[i] * (11 - i);
        }  //Verificação do CPF é valido

        int secondDigit = sum % 11;
        secondDigit = secondDigit < 2 ? 0 : 11 - secondDigit;

        if (digits[10] != secondDigit) {
            return false;  //Verificação do CPF é valido
        }

        return true;
    }
}
