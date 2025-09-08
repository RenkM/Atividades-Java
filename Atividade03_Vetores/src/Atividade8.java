import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[8];
        int[] B = new int[8];

        //leitura do vetor A
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor de A: ");
            A[i] = sc.nextInt();
        }

        //construção do vetor B
        for (int i = 0; i < 8; i++) {
            B[i] = A[i] * 3;
        }

        //exibição do vetor B
        System.out.println("\nVetor B (elementos de A multiplicados por 3):");
        for (int i = 0; i < 8; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        }

        sc.close();
    }
}
