import java.util.Scanner;

public class atividade03 {
    public static void main(String[] args) {

        int numero = 18;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numero = leitor.nextInt();

        if (numero % 2 == 0){
            System.out.println("O número é par");
        }
        else if (numero % 2 == 1){
            System.out.println("O número é Impar");
        }
    }
}
