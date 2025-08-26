import java.util.Objects;
import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {

        //Declaração de variavel
        String nomeDeUsuario;
        String senha;
        Scanner leitor = new Scanner(System.in);

        //Usuário lê e digita
        System.out.println("Nome de Usuário:");
        nomeDeUsuario = leitor.nextLine();
        System.out.println("Senha:");
        senha = leitor.nextLine();

        //condição
        if (Objects.equals(nomeDeUsuario, "MatheusRenk") && Objects.equals(senha, "matheus12345")) {
            System.out.println("Acesso concebido!");
        }
        else {
            System.out.println("Acesso negado!");
        }
    }
}