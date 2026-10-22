public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) throws SalarioInvalidoException {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.10;
    }
}
