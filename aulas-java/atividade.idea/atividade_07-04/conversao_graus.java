import java.util.Scanner;
class Consumo_Medio {
    public static void main(String[] args) {
        Scanner receberDados = new Scanner(System.in);

        System.out.println("Digite a distancia percorrida:");
        double Distancia = receberDados.nextDouble();
        System.out.println("Digite o combustivel gasto por litro:");
        double combustivel  = receberDados.nextDouble();
        if (combustivel != 0) {
            double consumo = Distancia / combustivel;
            System.out.println("o consumo medio por km do automovel e: " + consumo + " por litros :");

        }else {
            System.out.println("erro nao e possivel gastar 0 litros de gasolina");
        }

        receberDados.close();



    }
}