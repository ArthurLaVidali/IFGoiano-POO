public class carroLuxo extends Carros{
    private int qntAirBags;
    private double tamanhoPortaMalas;
    private boolean gpsIntegrado;

    public carroLuxo(String marca, String modelo, String placa, int anoDoCarro, double valorLoca, boolean disponivel, int renovacoes, double valorAdd, int qntAirBags, double tamanhoPortaMalas, boolean gpsIntegrado) {
        super(marca, modelo, placa, anoDoCarro, valorLoca, disponivel, renovacoes, valorAdd);
        this.qntAirBags = qntAirBags;
        this.tamanhoPortaMalas = tamanhoPortaMalas;
        this.gpsIntegrado = gpsIntegrado;
    }

    public int qntAirBags() {
        return qntAirBags;
    }

    public carroLuxo setQntAirBags(int qntAirBags) {
        this.qntAirBags = qntAirBags;
        return this;
    }

    public double tamanhoPortaMalas() {
        return tamanhoPortaMalas;
    }

    public carroLuxo setTamanhoPortaMalas(double tamanhoPortaMalas) {
        this.tamanhoPortaMalas = tamanhoPortaMalas;
        return this;
    }

    public boolean gpsIntegrado() {
        return gpsIntegrado;
    }

    public carroLuxo setGpsIntegrado(boolean gpsIntegrado) {
        this.gpsIntegrado = gpsIntegrado;
        return this;
    }
}
