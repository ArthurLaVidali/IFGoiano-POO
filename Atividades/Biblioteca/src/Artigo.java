import java.util.ArrayList;
import java.util.Date;

public class Artigo extends Publicacao{
    private String resumo;

    public Artigo(Date dataPubli, String titulo, String resumo, double multa) {
        super(dataPubli, titulo, multa);
        this.resumo = resumo;
    }

    public String resumo() {
        return resumo;
    }

    public Artigo setResumo(String resumo) {
        this.resumo = resumo;
        return this;
    }
}
