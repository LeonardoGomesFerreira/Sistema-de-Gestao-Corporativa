import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        int opcao = 0;

        try {
            while (opcao != 6) {

                System.out.println("\n===== EMPRESA JAVA =====");
                System.out.println("1 - Cadastrar desenvolvedor");
                System.out.println("2 - Cadastrar gerente");
                System.out.println("3 - Cadastrar estagiario");
                System.out.println("4 - Listar funcionarios");
                System.out.println("5 - Quantidade de funcionarios");
                System.out.println("6 - Sair");
                System.out.print("Escolha uma opcao: ");

                try {
                    opcao = Integer.parseInt(scanner.nextLine());

                    switch (opcao) {

                        case 1:
                            cadastrarFuncionario(scanner, funcionarios, 1);
                            break;
                        case 2:
                            cadastrarFuncionario(scanner, funcionarios, 2);
                            break;
                        case 3:
                            cadastrarFuncionario(scanner, funcionarios, 3);
                            break;
                        case 4:
                            if (funcionarios.isEmpty()) {
                                System.out.println("Nenhum funcionario cadastrado.");
                            } else {
                                for (Funcionario funcionario : funcionarios) {
                                    System.out.println("\n----------------");
                                    funcionario.exibirDados();

                                    if (funcionario instanceof Tributavel) {
                                        Tributavel tributavel = (Tributavel) funcionario;
                                        System.out.printf("Imposto: R$ %.2f%n", tributavel.calcularImposto());
                                    }
                                }
                            }
                            break;
                        case 5:
                            System.out.println("Total de funcionarios: " + Empresa.getQuantidadeFuncionarios());
                            break;
                        case 6:
                            System.out.println("Encerrando o sistema...");
                            break;
                        default:
                            System.out.println("Opcao invalida. Escolha de 1 a 6.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Erro: digite um numero valido.");
                }
            }
        } finally {
            scanner.close();
            System.out.println("Programa finalizado.");
        }
    }

    private static void cadastrarFuncionario(Scanner scanner, ArrayList<Funcionario> funcionarios, int tipo) {
        try {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Salario: R$ ");
            double salario = Double.parseDouble(scanner.nextLine());

            Funcionario funcionario;
            switch (tipo) {
                case 1:
                    funcionario = new Desenvolvedor(nome, salario);
                    break;
                case 2:
                    funcionario = new Gerente(nome, salario);
                    break;
                case 3:
                    funcionario = new Estagiario(nome, salario);
                    break;
                default:
                    System.out.println("Tipo de funcionario invalido.");
                    return;
            }
            funcionarios.add(funcionario);
            System.out.println("Funcionario cadastrado com sucesso!");
        } catch (SalarioInvalidoException e) {
            System.out.println("Erro de salario: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro nos dados: " + e.getMessage());
        } finally {
            System.out.println("Operacao de cadastro finalizada.");
        }
    }
}