public class PessoaFísica extends Clientes{
    private String cpf;
    private boolean emprestimosPorVez;

    public PessoaFísica(String nome, String telefone, String endereco, String cpf, int emprestimosPorVez) {
        super(nome, telefone, endereco);
        this.cpf = cpf;
        this.emprestimosPorVez = false;
    }

    public String cpf() {
        return cpf;
    }

    public PessoaFísica setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public boolean emprestimosPorVez() {
        return emprestimosPorVez;
    }

    public PessoaFísica setEmprestimosPorVez(boolean emprestimosPorVez) {
        this.emprestimosPorVez = emprestimosPorVez;
        return this;
    }
}
