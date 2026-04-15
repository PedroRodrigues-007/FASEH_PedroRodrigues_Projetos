import java.util.Scanner;

class custo_carro {
    public static void main(String[] args) {
        Scanner receberDados = new Scanner(System.in);
        System.out.println("digite o valor do custo de fabricaçao: ");
        double custo_fabricacao = receberDados.nextDouble();

        double imposto = 45;
        double distribuidor = 28;

        double  custo_imposto = custo_fabricacao*(imposto/100);
        double  custo_consumidor = custo_imposto*(distribuidor/100);
        System.out.println("o valor do custo do carro com juro e R$: " + custo_consumidor);

        receberDados.close();
    }
}