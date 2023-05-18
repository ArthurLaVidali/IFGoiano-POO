public class PessoaJuridica extends Clientes{
    private String cnpj;
    private String nomeRepresentante;
    private int emprestimosPorVez;


    public PessoaJuridica(String nome, String telefone, String endereco, String cnpj, String nomeRepresentante, int emprestimosPorVez) {
        super(nome, telefone, endereco);
        this.cnpj = cnpj;
        this.nomeRepresentante = nomeRepresentante;
        this.emprestimosPorVez = emprestimosPorVez;
    }

    public String cnpj() {
        return cnpj;
    }

    public PessoaJuridica setCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public String nomeRepresentante() {
        return nomeRepresentante;
    }

    public PessoaJuridica setNomeRepresentante(String nomeRepresentante) {
        this.nomeRepresentante = nomeRepresentante;
        return this;
    }

    public int emprestimosPorVez() {
        return emprestimosPorVez;
    }

    public PessoaJuridica setEmprestimosPorVez(int emprestimosPorVez) {
        this.emprestimosPorVez = emprestimosPorVez;
        return this;
    }
}
