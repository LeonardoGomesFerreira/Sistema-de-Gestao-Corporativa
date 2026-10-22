public class Empresa {
    private static int contadorFuncionarios = 0;

    public static void registrarFuncionario() {
        contadorFuncionarios++;
    }

    public static int getQuantidadeFuncionarios() {
        return contadorFuncionarios;
    }
}
