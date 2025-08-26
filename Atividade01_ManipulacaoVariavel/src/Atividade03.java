import java.text.NumberFormat;
import java.util.Locale;


public class Atividade03 {
    public static void main(String[] args) {

        String nomeProduto = "Salgadinho";
        double precoUnitario = 10.0;
        int quantidadeProdutosComprados = 100;
        double taxaImpostoProduto = 25.0;
        double margemDeLucro = 20.0;

        NumberFormat moedaBrasil = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        double valorSemImpostos = precoUnitario * quantidadeProdutosComprados;

        //calculo do imposto
        double valorImposto = valorSemImpostos * (taxaImpostoProduto / 100);

        //valor total com imposto

        double valorComImpostos = valorSemImpostos + valorImposto;
        double precoDeVenda = (valorComImpostos) / (1 + margemDeLucro);

        System.out.println("Esse é o valor sem impostos: " + moedaBrasil.format(valorSemImpostos));
        System.out.println("Esse é o valor do imposto: " + moedaBrasil.format(valorImposto));
        System.out.printf("Esse é o preco de venda: " + moedaBrasil.format(precoDeVenda));




    }
}
