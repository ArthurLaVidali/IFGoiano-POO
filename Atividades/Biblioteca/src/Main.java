import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("nome", "titulacao");
        Biblioteca biblioteca = new Biblioteca("Nome", "Endereço");
        Livro livro = new Livro(new Date(),"Titulo", 1, "Editora","ISBN", 0.0);
        Artigo artigo = new Artigo(new Date(), "Titulo", "Resumo", 0.0);
        Tese tese = new Tese(new Date(), "Titulo", 0, "resumo", new Date(), "Instituição",autor,0.0);
        biblioteca.publicacaos.add(livro);
        biblioteca.publicacaos.add(artigo);
        biblioteca.publicacaos.add(tese);
    }
}