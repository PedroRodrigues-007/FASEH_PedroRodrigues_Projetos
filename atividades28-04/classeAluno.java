class Aluno {
    String nome;
    double nota1;
    double nota2;

    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    void verificarSituacao() {
        double media = calcularMedia();
        if (media >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}

public class classeAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Carlos";
        aluno.nota1 = 7;
        aluno.nota2 = 5;

        System.out.println("Média: " + aluno.calcularMedia());
        aluno.verificarSituacao();
    }
}