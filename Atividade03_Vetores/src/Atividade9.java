import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] modelos = new String[5];   //vetor para os nomes dos carros
        double[] consumo = new double[5];   //vetor para km/l de cada carro

        //leitura dos dados
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o modelo do carro " + (i+1) + ": ");
            modelos[i] = sc.nextLine();

            System.out.print("Digite o consumo (km/L) do " + modelos[i] + ": ");
            consumo[i] = sc.nextDouble();
            sc.nextLine(); //consumir quebra de linha
        }

        // a) encontrar o carro mais econômico
        int indiceMaisEconomico = 0;
        for (int i = 1; i < 5; i++) {
            if (consumo[i] > consumo[indiceMaisEconomico]) {
                indiceMaisEconomico = i;
            }
        }

        System.out.println("\nCarro mais econômico: " + modelos[indiceMaisEconomico]);

        // b) calcular quantos litros cada carro gasta em 1000 km
        System.out.println("\nConsumo de combustível para percorrer 1000 km:");
        for (int i = 0; i < 5; i++) {
            double litrosNecessarios = 1000.0 / consumo[i];
            System.out.printf("%s: %.2f litros%n", modelos[i], litrosNecessarios);
        }

        sc.close();
    }
}
