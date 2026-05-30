package Exercicio2;

public class ProdutoEletronico extends Produto {
    public ProdutoEletronico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto() {
        return preco * 0.10;
    }
}
