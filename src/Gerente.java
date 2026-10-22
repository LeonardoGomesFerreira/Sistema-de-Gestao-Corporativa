public class Gerente extends Funcionario implements Tributavel {
    public Gerente(String nome, double salario) throws SalarioInvalidoException {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.15;
    }

    @Override
    public double calcularImposto() {
        return getSalario() * 0.05;
    }
}
