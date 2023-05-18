public class usuarioEspecial extends Usuario{
    private int emprestimo;

    public usuarioEspecial(String nome, String telefone, String email, String cpf, int emprestimo) {
        super(nome, telefone, email, cpf);
        this.emprestimo = emprestimo;
    }

    public int emprestimo() {
        return emprestimo;
    }

    public usuarioEspecial setEmprestimo(int emprestimo) {
        this.emprestimo = emprestimo;
        return this;
    }
}
