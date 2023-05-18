public class usuarioComum extends Usuario{
    private int emprestimo;
    private boolean alugado;

    public usuarioComum(String nome, String telefone, String email, String cpf, int emprestimo) {
        super(nome, telefone, email, cpf);
        this.emprestimo = 1;
        this.alugado = false;
    }

    public boolean getalugado() {
        return alugado;
    }

    public usuarioComum setAlugado(boolean alugado) {
        this.alugado = alugado;
        return this;
    }

    public int emprestimo() {
        return emprestimo;
    }

    public usuarioComum setEmprestimo(int emprestimo) {
        this.emprestimo = emprestimo;
        return this;
    }
}
