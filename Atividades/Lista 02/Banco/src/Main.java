import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cadastro de usuário
        System.out.println("----- Cadastro de usuário -----");
        System.out.print("Digite o número da conta: ");
        String numeroConta = scanner.next();
        System.out.print("Digite o CPF: ");
        String CPF = scanner.next();
        System.out.print("Digite a senha: ");
        String senha = scanner.next();
        System.out.print("Digite o PIX: ");
        String PIX = scanner.next();

        ContaCorrente conta = new ContaCorrente(numeroConta, CPF, senha, PIX);

        // Login
        System.out.println("\n----- Login -----");
        System.out.print("Digite o CPF: ");
        String CPFLogin = scanner.next();
        //

        System.out.print("Digite a senha: ");
        String senhaLogin = scanner.next();

        if (conta.realizarLogin(CPFLogin, senhaLogin)) {
            System.out.println("\nLogin realizado com sucesso!");
            System.out.println("\nNumero da conta: "+numeroConta);
            // Menu de opções
            while (true) {
                System.out.println("\n----- Menu -----");
                System.out.println("1. Transferência");
                System.out.println("2. Ver saldo");
                System.out.println("3. Depositar");
                System.out.println("4. Sacar");
                System.out.println("5. Sair");
                System.out.print("Escolha uma opção: ");
                int opcao = scanner.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.print("Digite o valor da transferência: ");
                        double valor = scanner.nextDouble();
                        System.out.print("Digite o PIX de destino: ");
                        String pixDestino = scanner.next();
                        conta.transferir(valor, pixDestino);
                        break;
                    case 2:
                        conta.verSaldo();
                        break;
                    case 3:
                        System.out.println("Digite o valor que deseja depositar: ");
                        valor = scanner.nextDouble();
                        conta.depositar(valor);
                        break;
                    case 4:
                        System.out.println("Digite o valor que deseja sacar: ");
                        valor = scanner.nextDouble();
                        conta.sacar(valor);
                        break;
                    case 5:
                        System.out.println("Obrigado por utilizar nosso sistema!");
                        System.exit(0);
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            }
        } else {
            System.out.println("\nCPF ou senha incorretos. Tente novamente.");
        }
    }
}