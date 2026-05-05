class Pessoa {
    String nome;
    int idade;

    void apresentar() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }

    void fazerAniversario() {
        idade++;
    }
}

public class main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "João";
        p1.idade = 20;

        p1.apresentar();
        p1.fazerAniversario();
        p1.apresentar();
    }
}
