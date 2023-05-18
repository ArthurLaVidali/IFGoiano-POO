import java.util.ArrayList;
import java.util.Date;

public class Tese extends Publicacao{
    private int numPag;
    private String resumo;
    private Date defesaData;
    private String instituicao;
    private Autor autor;

    public Tese(Date dataPubli, String titulo, int numPag, String resumo, Date defesaData, String instituicao, Autor autor, double multa) {
        super(dataPubli, titulo, multa);
        this.numPag = numPag;
        this.resumo = resumo;
        this.defesaData = defesaData;
        this.instituicao = instituicao;
        this.autor = autor;
    }

    public int numPag() {
        return numPag;
    }

    public Tese setNumPag(int numPag) {
        this.numPag = numPag;
        return this;
    }

    public String resumo() {
        return resumo;
    }

    public Tese setResumo(String resumo) {
        this.resumo = resumo;
        return this;
    }

    public Date getDefesaData() {
        return defesaData;
    }

    public Tese setDefesaData(Date defesa) {
        this.defesaData = defesa;
        return this;
    }

    public String instituicao() {
        return instituicao;
    }

    public Tese setInstituicao(String instituicao) {
        this.instituicao = instituicao;
        return this;
    }
    @Override
    public void adicionarAutor(Autor autor){
        if (this.autor == null){
            this.autor = autor;
        }else System.out.println("Esta tese já tem um autor registrado.");
    }
}
