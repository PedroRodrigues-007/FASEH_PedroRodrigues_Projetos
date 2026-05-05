class Produto {
    String nome;
    double preco;
    int quantidade;

    double calcularValorTotal() {
        return preco * quantidade;
    }

    void exibirProduto() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
    }
}

public class classeProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 3000;
        p1.quantidade = 2;

        Produto p2 = new Produto();
        p2.nome = "Mouse";
        p2.preco = 50;
        p2.quantidade = 3;

        p1.exibirProduto();
        System.out.println("Total: R$ " + p1.calcularValorTotal());

        p2.exibirProduto();
        System.out.println("Total: R$ " + p2.calcularValorTotal());
    }
}