public abstract class Funcionario {
    private String nome;
    private double salario;
    public static final double SALARIO_MINIMO = 1518.00;

    public Funcionario(String nome, double salario) throws SalarioInvalidoException {
        if (!ValidacaoUtil.validarNome(nome)) {
            throw new IllegalArgumentException("O nome não pode ser vazio.");
        }

        if (!ValidacaoUtil.validarSalario(salario)) {
            throw new SalarioInvalidoException("O salário deve ser maior que zero.");
        }

        this.nome = nome;
        this.salario = salario;
        Empresa.registrarFuncionario();
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public abstract double calcularBonus();

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.printf("Salário: R$ %.2f%n", salario);
        System.out.printf("Bônus: R$ %.2f%n", calcularBonus());
    }
}