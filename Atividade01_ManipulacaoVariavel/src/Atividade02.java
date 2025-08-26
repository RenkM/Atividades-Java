public class Atividade02 {
    public static void main(String[] args) {

    String nome = "Matheus";
    int idade = 20;
    double salarioMensal = 2500;
    int mesesTrabalhados = 12;
    int qntProdutosComprados = 125;
    double valorGastoProdutos = 50.99;
    double salarioAnualBruto = 30000;
    double descontoAnualSalario = 2000;

    double totalSalarioAnualBruto = salarioMensal * mesesTrabalhados;
    double salarioAnualLiquido = salarioAnualBruto - descontoAnualSalario;
    double mediaValorProdutos = qntProdutosComprados / valorGastoProdutos;

    String informations = "Olá " + nome + "! seu salário anual é: R$ " + salarioAnualLiquido;

    System.out.println(informations);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Seu salário mensal é: R$ " + salarioMensal);
        System.out.println("Você trabalhou: " + mesesTrabalhados + " meses");
        System.out.println("Valor gasto por produtos: R$ " + valorGastoProdutos);
        System.out.println("Seu salário anual bruto é: R$ " + salarioAnualBruto);
        System.out.println("Desconto anual do seu salário é: R$ " + descontoAnualSalario);

    }
}