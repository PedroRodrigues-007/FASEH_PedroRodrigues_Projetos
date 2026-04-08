import java.util.Scanner;

class ComissaoVendas {
    public static void main(String[] args) {
        String nomeVendedor;
        float salarioFixo, valorVendas, comissao, salarioTotal;

        Scanner receberDados = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor:");
        nomeVendedor = receberDados.next();

        System.out.println("Digite o salário fixo do vendedor:");
        salarioFixo = Float.parseFloat(receberDados.next());

        System.out.println("Digite o valor das vendas:");
        valorVendas = Float.parseFloat(receberDados.next());

        comissao = 0.15f;

        salarioTotal = salarioFixo + (valorVendas * comissao);

        System.out.println("O salário total do vendedor com comissão é: " + salarioTotal);

        receberDados.close();
    }
}