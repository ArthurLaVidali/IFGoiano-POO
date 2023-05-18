import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private String endereco;
    ArrayList<Publicacao> publicacaos= new ArrayList<Publicacao>();

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String nome() {
        return nome;
    }

    public Biblioteca setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String endereco() {
        return endereco;
    }

    public Biblioteca setEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }
}
