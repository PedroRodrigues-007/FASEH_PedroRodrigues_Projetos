import java.util.Scanner;

class juros_poupanca {
    public static void main(String[] args) {
        Scanner receberDados = new Scanner(System.in);

        System.out.println("digite o valor do deposito: ")
        double deposito = receberDados.nextDouble();
        double v1 = 0.70;
        double v2= (deposito*v1)/100;

        System.out.println("o valor depositado e:R$ "+ deposito);
        System.out.println("o rendimento e de: R$"+ v2);
        System.out.println("a soma do deposito com o rendimento e de: R$ " (deposito+v2);

        receberDados.close();
    }
}