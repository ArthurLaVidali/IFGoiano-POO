import java.lang.ref.Cleaner;
import java.util.ArrayList;

public class Locadora {
    private String nome;
    private String edereco;
    private String telefone;
    ArrayList<Carros> carros = new ArrayList<Carros>();
    ArrayList<Clientes> clientes = new ArrayList<Clientes>();

    public String telefone() {
        return telefone;
    }

    public Locadora setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public Locadora(String nome, String edereco, String telefone) {
        this.nome = nome;
        this.edereco = edereco;
        this.telefone = telefone;
    }

    public Locadora(String nome, String edereco) {
        this.nome = nome;
        this.edereco = edereco;
    }

    public String nome() {
        return nome;
    }

    public Locadora setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String edereco() {
        return edereco;
    }

    public Locadora setEdereco(String edereco) {
        this.edereco = edereco;
        return this;
    }
}
