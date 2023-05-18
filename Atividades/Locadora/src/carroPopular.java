public class carroPopular extends Carros{
    private boolean arcondicionado;

    public carroPopular(String marca, String modelo, String placa, int anoDoCarro, double valorLoca, boolean disponivel, int renovacoes, double valorAdd, boolean arcondicionado) {
        super(marca, modelo, placa, anoDoCarro, valorLoca, disponivel, renovacoes, valorAdd);
        this.arcondicionado = arcondicionado;
    }

    public boolean arcondicionado() {
        return arcondicionado;
    }

    public carroPopular setArcondicionado(boolean arcondicionado) {
        this.arcondicionado = arcondicionado;
        return this;
    }
}
