import java.util.Scanner;

class conversao {
    public static void main(String[] args) {
        Scanner receberDados = new Scanner(System.in);

        System.out.println("qual a temperatura em graus celsius: ")
         double C = receberDados.nextDouble();
          double F = (9*C+160)/5;

        System.out.println("a temperatura em graus farenhait e: " + F);
        receberDados.close();
     }
    }