import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];

        //leitura dos valores
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            vetor[i] = sc.nextInt();
        }

        //impressão dos pares
        System.out.println("\nNúmeros pares digitados:");
        for (int i = 0; i < 10; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}