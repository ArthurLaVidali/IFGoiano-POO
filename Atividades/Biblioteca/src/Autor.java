public class Autor {
    private String nome;
    private String titulacao;

    public Autor(String nome, String titulacao) {
        this.nome = nome;
        this.titulacao = titulacao;
    }

    public String nome() {
        return nome;
    }

    public Autor setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String titulacao() {
        return titulacao;
    }

    public Autor setTitulacao(String titulacao) {
        this.titulacao = titulacao;
        return this;
    }
}
