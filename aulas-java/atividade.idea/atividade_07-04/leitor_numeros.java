import java.util.Scanner;

class leitor_numeros {
    public static void main(String[] args) {
        Scanner receberDados = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int n1 = receberDados.nextInt();
        System.out.println("Digite o segundo numero:");
        int n2 = receberDados.nextInt();

        int maior;

        if (n1>n2) {
            maior = n1;
        }else {
            maior = n2;

            System.out.println("o maior numero e: " + maior);


            if (maior >= 0 && maior <= 99) {
                System.out.println("O número está entre 0 e 99.");
            } else if (maior >= 100 && maior <= 199) {
                System.out.println("O número está entre 100 e 199.");
            } else if (maior >= 200) {
                System.out.println("O número o numero e maior que 200");
            } else {
                System.out.println("O número e negativo");
                receberDados.close();
            }
        }
    }
}