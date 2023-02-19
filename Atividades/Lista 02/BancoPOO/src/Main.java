import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaCorrente conta = null;
        boolean loggedIn = false;

        while (true) {
            if (!loggedIn) {            //Usuário seleciona o que ele deseja fazer
                System.out.println("1. Cadastrar conta");
                System.out.println("2. Fazer login");
                System.out.println("0. Sair");

                int opcao = scanner.nextInt();

                if (opcao == 1) {                           //Se o usuário deseja cadastrar, ao digitar cpf,
                    System.out.println("Digite seu CPF:");  // irá verificar se o CPF é valido
                    String cpf = scanner.next();

                    if (!ContaCorrente.validarCPF(cpf)) {
                        System.out.println("CPF inválido.");
                        continue;
                    }

                    System.out.println("Digite o número da conta:"); //Usuario digita Numero da conta
                    int numeroConta = scanner.nextInt();

                    System.out.println("Digite uma senha:");  //Usuario digita senha da conta
                    String senha = scanner.next();

                    conta = new ContaCorrente(0, numeroConta, cpf, senha, null); //Onde é criada a conta
                    System.out.println("Conta cadastrada com sucesso.");                   //E envia os dados a Classe 'ContaCorrente'
                } else if (opcao == 2) {        //Após o login feito, é necessário fazer o login na conta
                    System.out.println("Digite o número da conta:");  //Digita numero da conta e senha
                    int numeroConta = scanner.nextInt();

                    System.out.println("Digite a senha:");
                    String senha = scanner.next();

                    if (conta != null && conta.getNumeroConta() == numeroConta && conta.getSenha().equals(senha)) {
                        loggedIn = true;        //Verificação de se o numero da conta e senha são o mesmo do cadastro
                        System.out.println("Login realizado com sucesso.");
                    } else {
                        System.out.println("Número da conta ou senha incorretos.");
                    }
                } else if (opcao == 0) {    //Encerra o código
                    break;
                } else {
                    System.out.println("Opção inválida.");
                }
            } else {    //Após login, feito aparece as opções de Saldo, Deposito, Saque, Transferir, ou sair
                System.out.println("1. Ver saldo");
                System.out.println("2. Depositar");
                System.out.println("3. Sacar");
                System.out.println("4. Transferir");
                System.out.println("0. Sair");

                int opcao = scanner.nextInt();

                if (opcao == 1) {   //Sistema de saque
                    System.out.println("Saldo: " + conta.getSaldo());
                } else if (opcao == 2) {  //Sistema de Deposito
                    System.out.println("Digite o valor a depositar:");
                    double valor = scanner.nextDouble();
                    conta.depositar(valor);
                } else if (opcao == 3) {  ///Sistema de saque
                    System.out.println("Digite o valor a sacar:");
                    double valor = scanner.nextDouble();
                    conta.sacar(valor);
                } else if (opcao == 4) {   //Sistema de transferencia
                    System.out.println("Digite o valor a transferir:");
                    double valor = scanner.nextDouble();
                    System.out.println("Digite o PIX do destinatário:");
                    String pix = scanner.next();
                    conta.transferir(valor, pix);
                } else if (opcao == 0) { //Sair do programa
                    break;
                } else {
                    System.out.println("Opção inválida.");  //Opçõ invalida caso ele digite algum número não informada
                }
            }
        }
    }
}
