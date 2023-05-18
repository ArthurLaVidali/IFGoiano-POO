public class Carros {
    private String marca;
    private String modelo;
    private String placa;
    private int anoDoCarro;
    private double valorLoca;
    private boolean disponivel;
    private int renovacoes;
    private double valorAdd;

    public Carros(String marca, String modelo, String placa, int anoDoCarro, double valorLoca, boolean disponivel, int renovacoes, double valorAdd) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.anoDoCarro = anoDoCarro;
        this.valorLoca = valorLoca;
        this.disponivel = disponivel;
        this.renovacoes = renovacoes;
        this.valorAdd = valorAdd;
    }

    public double valorAdd() {
        return valorAdd;
    }

    public Carros setValorAdd(double valorAdd) {
        this.valorAdd = valorAdd;
        return this;
    }

    public int renovacoes() {
        return renovacoes;
    }

    public Carros setRenovacoes(int renovacoes) {
        this.renovacoes = renovacoes;
        return this;
    }

    public String marca() {
        return marca;
    }

    public Carros setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public String modelo() {
        return modelo;
    }

    public Carros setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public String placa() {
        return placa;
    }

    public Carros setPlaca(String placa) {
        this.placa = placa;
        return this;
    }

    public int anoDoCarro() {
        return anoDoCarro;
    }

    public Carros setAnoDoCarro(int anoDoCarro) {
        this.anoDoCarro = anoDoCarro;
        return this;
    }

    public double valorLoca() {
        return valorLoca;
    }

    public Carros setValorLoca(double valorLoca) {
        this.valorLoca = valorLoca;
        return this;
    }

    public boolean disponivel() {
        return disponivel;
    }

    public Carros setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
        return this;
    }
}
