import java.util.Scanner;

class inversaovalores {

    public static <string> void main(String[] args) {
      String a,b,aux;

       Scanner lerDados = new Scanner(System.in);
       System.out.println("digite o primeiro numero: ");
       a = lerDados.next();

        System.out.println("digite o segundo numero: ");
        b = lerDados.next();

        aux = a;
        a = b;
        b = aux;

        System.out.println("os numero que voce digitou invertido ficam : " + a + " " + b);
        lerDados.close();


    }
}