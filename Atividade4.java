import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[3];

        System.out.println("Digite três numeros: ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i + 1) + ": ");
        numeros[i] = scanner.nextInt();
    }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posição " + i + ": " + numeros[i]);

        }

        int soma = 0;
        for (int num : numeros) {
            soma += num;

        }

        double media = (double) soma / numeros.length;

        System.out.println("\nA média dos valores digitados são: " + media);

    }
}
