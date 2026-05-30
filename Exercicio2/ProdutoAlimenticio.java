package Exercicio2;

public class ProdutoAlimenticio extends Produto {
    public ProdutoAlimenticio(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto() {
        return preco * 0.05;
    }
}
