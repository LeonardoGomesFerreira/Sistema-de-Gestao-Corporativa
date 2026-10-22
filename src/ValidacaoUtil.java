public final class ValidacaoUtil {
    private ValidacaoUtil() {
        // Impede a criação de objetos desta classe.
    }

    public static boolean validarSalario(double salario) {
        return salario > 0;
    }

    public static boolean validarNome(String nome) {
        return nome != null && !nome.trim().isEmpty();
    }
}
