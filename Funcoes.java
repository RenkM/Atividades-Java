import java.util.Scanner;

public class Funcoes {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String opcao = "";

        System.out.println("Informe o primeiro valor");
        int primeiroValor = sc.nextInt();

        System.out.println("Informe o segundo valor");
        int segundoValor = sc.nextInt();

        System.out.println("Informe a operação");
        opcao = sc.next();

        int valorRetorno = realizarOperacoes(opcao, primeiroValor, segundoValor);
        realizarOperacoes(opcao, primeiroValor, segundoValor);

        System.out.println("Valor retornado é " + valorRetorno);

    }

    public static int realizarOperacoes(String opcao, int primeiroValor, int segundoValor) {

        int resultado = 0;

        if (opcao.equals("+")) {
            resultado = somarValores(primeiroValor, segundoValor);
        }else if (opcao.equals("-")) {
            resultado = subtrairValores(primeiroValor, segundoValor);
        }else if (opcao.equals("*")) {
            resultado = multiplicarValores(primeiroValor, segundoValor);
        }else if (opcao.equals("/")) {
            resultado = dividirValores(primeiroValor, segundoValor);
        }
        return resultado;
    }

    public static int somarValores(int primeiro, int segundo) {
        return primeiro + segundo;
    }

    public static int subtrairValores(int primeiro, int segundo) {
        return primeiro - segundo;
    }

    public static int multiplicarValores(int primeiro, int segundo) {
        return primeiro * segundo;
    }

    public static int dividirValores(int primeiro, int segundo) {
        return primeiro / segundo;
    }

}