public class carroSUV extends Carros{
    private double tamanhoPortaMalas;
    private String tipodeTracao;
    private String tipodeCombustivel;

    public carroSUV(String marca, String modelo, String placa, int anoDoCarro, double valorLoca, boolean disponivel, int renovacoes, double valorAdd, double tamanhoPortaMalas, String tipodeTracao, String tipodeCombustivel) {
        super(marca, modelo, placa, anoDoCarro, valorLoca, disponivel, renovacoes, valorAdd);
        this.tamanhoPortaMalas = tamanhoPortaMalas;
        this.tipodeTracao = tipodeTracao;
        this.tipodeCombustivel = tipodeCombustivel;
    }

    public double tamanhoPortaMalas() {
        return tamanhoPortaMalas;
    }

    public carroSUV setTamanhoPortaMalas(double tamanhoPortaMalas) {
        this.tamanhoPortaMalas = tamanhoPortaMalas;
        return this;
    }

    public String tipodeTracao() {
        return tipodeTracao;
    }

    public carroSUV setTipodeTracao(String tipodeTracao) {
        this.tipodeTracao = tipodeTracao;
        return this;
    }

    public String tipodeCombustivel() {
        return tipodeCombustivel;
    }

    public carroSUV setTipodeCombustivel(String tipodeCombustivel) {
        this.tipodeCombustivel = tipodeCombustivel;
        return this;
    }
}
