import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

public class Emprestimo {
    private Usuario usuario;
    private Publicacao publicacao;
    private LocalDate dataEmprest;
    private LocalDate dataDevolucao;

    private Calendar calendario = Calendar.getInstance();

    public Emprestimo(Usuario usuario, Publicacao publicacao) {
        this.usuario = usuario;
        this.publicacao = publicacao;
        this.dataEmprest = LocalDate.now();
        //this.calendario.setTime(this.dataEmprest);
        //this.calendario.add(Calendar.DAY_OF_MONTH,7);
        this.dataDevolucao = this.dataEmprest.plusDays(7);
    }

    public void alugar(){
        if(usuario.getClass().equals(usuarioComum.class)){ //Confere se o usuário é um usuário comum
            usuarioComum usuarioComum = (usuarioComum) usuario;
            if(usuarioComum.getalugado() == false){
                if (publicacao.getdisponivel() == true){ c
                    publicacao.setDisponivel(false);
                    usuarioComum.setAlugado(true);  //Proibe o usuário de fazer outra locação
                    System.out.println("Publicação foi alugada");

                }else System.out.println("A publicação desejada não está disponivel.");
            }else System.out.println("Você já está alugando um livro.");

        }
            if (publicacao.getdisponivel() == true){
            publicacao.setDisponivel(false);
            System.out.println("Publicação foi alugada");

            }else System.out.println("A publicação desejada não está disponivel.");
    }

    public void devolucao(){
        if(usuario.getClass().equals(usuarioComum.class)){ //Confere se o usuário é um usuário comum
        usuarioComum usuarioComum = (usuarioComum) usuario;
        if(usuarioComum.getalugado() == true){b
            if (publicacao.getdisponivel() == false){
                publicacao.setDisponivel(true);
                usuarioComum.setAlugado(false);  //Proibe o usuário de fazer outra locação
                System.out.println("Publicação foi devolvida com sucesso");

            }else System.out.println("Você não está com esta publicação");
        }else System.out.println("Você não está alugando o livro");
        }
    }

    public Double calculaMulta(){
        Period period = Period.between(dataEmprest, dataDevolucao);
        int days = period.getDays();
        if (days>0){
            Double multa = days*publicacao.multa();
            return multa;
        }
        return 0.0;
    }
}