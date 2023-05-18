import java.util.ArrayList;
import java.util.Date;

public class Publicacao {
    private Date dataPubli;
    private String titulo;
    ArrayList<Publicacao> referencia;
    ArrayList<Autor> autores;
    private boolean disponivel;
    private double multa;

    public Publicacao(Date dataPubli, String titulo, double multa) {
        this.dataPubli = dataPubli;
        this.titulo = titulo;
        this.multa = multa;
        this.referencia = new ArrayList<Publicacao>();
        this.autores = new ArrayList<Autor>();
        this.disponivel = true;
    }

    public double multa() {
        return multa;
    }

    public Publicacao setMulta(double multa) {
        this.multa = multa;
        return this;
    }

    public boolean getdisponivel() {
        return disponivel;
    }

    public Publicacao setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
        return this;
    }

    public Date dataPubli() {
        return dataPubli;
    }

    public Publicacao setDataPubli(Date dataPubli) {
        this.dataPubli = dataPubli;
        return this;
    }

    public String titulo() {
        return titulo;
    }

    public Publicacao setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public void adicionarAutor(Autor autor){
        autores.add(autor);
    }

}
