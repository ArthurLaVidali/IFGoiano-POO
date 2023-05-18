public class Usuario {
    private String nome, telefone, email, cpf;

    public Usuario(String nome, String telefone, String email, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
    }

    public String nome() {
        return nome;
    }

    public Usuario setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String telefone() {
        return telefone;
    }

    public Usuario setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public String email() {
        return email;
    }

    public Usuario setEmail(String email) {
        this.email = email;
        return this;
    }

    public String cpf() {
        return cpf;
    }

    public Usuario setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }
}
