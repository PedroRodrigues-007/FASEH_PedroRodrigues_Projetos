import java.util.Scanner;

class atividades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite outro número inteiro: ");
        int num2 = scanner.nextInt();

        int sub = num1 - num2;
        int soma = num1 + num2;

        if (num2 != 0) {
            int div = num1 / num2;
            System.out.println("Divisão é: " + div);
        } else {
            System.out.println("Não é possível dividir por zero.");
        }

        int mult = num1 * num2;

        System.out.println("Subtração é: " + sub);
        System.out.println("Soma é: " + soma);
        System.out.println("Multiplicação é: " + mult);

        scanner.close();
    }
}