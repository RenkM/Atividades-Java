import java.util.Scanner;
public class atividade02 {
    public static void main(String[] angs) {

        //Declaração de variável
        String nomeDoAluno;
        double notaDoAluno;
        Scanner leitor = new Scanner(System.in);

        //Usuário lê e digita
        System.out.println("Digite o seu nome: ");
        nomeDoAluno = leitor.nextLine();
        System.out.println("Digite a sua nota no Java: ");
        notaDoAluno = leitor.nextDouble();

        //Condições
        if (notaDoAluno >= 9){
            System.out.println("Sua nota é Excelente "+ nomeDoAluno + "!");
        }
        else if  (notaDoAluno >= 7){
            System.out.println("Sua nota é Boa "+ nomeDoAluno + "!");
        }
        else if (notaDoAluno >= 5){
            System.out.println("Sua nota é Satisfatória "+ nomeDoAluno + "!");
        }
        else if (notaDoAluno < 5){
            System.out.println("Sua nota é Insatisfatória " + nomeDoAluno + "!");
        }
    }
}