public class Estagiario extends Funcionario {

    public Estagiario(String nome, double salario) throws SalarioInvalidoException {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.05;
    }
}
