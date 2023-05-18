import java.util.ArrayList;
import java.util.Date;

public class Livro extends Publicacao{
    private int numEdicao;
    private String editora;
    private String ISBN;

    public Livro(Date dataPubli, String titulo, int numEdicao, String editora, String ISBN, double multa) {
        super(dataPubli, titulo, multa);
        this.numEdicao = numEdicao;
        this.editora = editora;
        this.ISBN = ISBN;
    }

    public int numEdicao() {
        return numEdicao;
    }

    public Livro setNumEdicao(int numEdicao) {
        this.numEdicao = numEdicao;
        return this;
    }

    public String editora() {
        return editora;
    }

    public Livro setEditora(String editora) {
        this.editora = editora;
        return this;
    }

    public String ISBN() {
        return ISBN;
    }

    public Livro setISBN(String ISBN) {
        this.ISBN = ISBN;
        return this;
    }
}
