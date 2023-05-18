public class Clientes {
    private String nome;
    private String telefone;
    private String endereco;

    public Clientes(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String nome() {
        return nome;
    }

    public Clientes setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String telefone() {
        return telefone;
    }

    public Clientes setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public String endereco() {
        return endereco;
    }

    public Clientes setEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }
}
