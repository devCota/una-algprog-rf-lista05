package Exercicio2;

public class ProdutoVestuario extends Produto {
    public ProdutoVestuario(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto() {
        return preco * 0.15;
    }
}
