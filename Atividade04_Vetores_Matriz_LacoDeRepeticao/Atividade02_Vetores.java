import java.util.Random;

public class Atividade02_Vetores {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numeros = new int[15];

        //preenche o vetor com números aleatórios entre 1 e 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1; // gera de 1 a 100
        }

        System.out.println("Números pares:");
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\n\nNúmeros ímpares:");
        for (int num : numeros) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
