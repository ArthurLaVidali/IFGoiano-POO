import java.time.LocalDate;
import java.time.Period;

public class Emprestimo {
    private Clientes clientes;
    private Carros carros;
    private LocalDate dataAlugar;
    private LocalDate dataDevol;
    private int cont=0;

    public Emprestimo(Clientes clientes, Carros carros, LocalDate dataAlugar, LocalDate dataDevol) {
        this.clientes = clientes;
        this.carros = carros;
        this.dataAlugar = LocalDate.now();
        this.dataDevol = this.dataAlugar.plusDays(7);
    }

    public void alugar() {
        if (clientes.getClass().equals(PessoaFísica.class)) {
            PessoaFísica pessoaFísica = (PessoaFísica) clientes;
            if (pessoaFísica.emprestimosPorVez() == false) {
                if (carros.disponivel() == true) {
                    carros.setDisponivel(false);
                    pessoaFísica.setEmprestimosPorVez(true);
                    System.out.println("Carro alugado com sucesso");
                } else throw new CarroIndisponivel("O carro não se encontra indisponivel");
            } else throw new LimiteEmprestimo("Limite de empréstimos atingidos");
        }
        if (carros.disponivel() == true) {
            carros.setDisponivel(false);
            System.out.println("Carro alugado com sucesso");
        } else System.out.println("O modelo não está disponivel");
    }

    public double devolucao() {
        if (clientes.getClass().equals(PessoaFísica.class)) {
            PessoaFísica pessoaFísica = (PessoaFísica) clientes;
            if (pessoaFísica.emprestimosPorVez() == true) {
                if (carros.disponivel() == false) {
                    carros.setDisponivel(true);
                    pessoaFísica.setEmprestimosPorVez(false);
                    System.out.println("Carro devolvido com sucesso");
                    return calculaMulta();
                } else System.out.println("Este modelo de carro não está sendo alugado por você");
            } else System.out.println("Você não está alugando nenhum carro");
        }
        if (carros.disponivel() == false) {
            carros.setDisponivel(true);
            System.out.println("Carro devolvido com sucesso");
        } else System.out.println("O modelo de carro não está sendo alugado");
        return 0.0;
    }

    public Double calculaMulta() {
        Period period = Period.between(dataAlugar, dataDevol);
        int days = period.getDays();
        if (days>0){
            double multa = carros.valorLoca()+carros.valorAdd()*cont;
            return multa;
        }return 0.0;
    }

    public void renovacao(){
        dataDevol = dataDevol.plusDays(7);
        if (carros.renovacoes()>0){
            carros.setRenovacoes(carros.renovacoes()-1);
        }else {
            cont++;
        }
    }
}
