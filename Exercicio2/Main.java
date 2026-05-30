package Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<Produto>();

        produtos.add(new ProdutoEletronico("Notebook", 3500.00));
        produtos.add(new ProdutoAlimenticio("Arroz 5kg", 25.00));
        produtos.add(new ProdutoVestuario("Camisa", 80.00));
        produtos.add(new ProdutoEletronico("Fone Bluetooth", 200.00));
        produtos.add(new ProdutoVestuario("Calca Jeans", 120.00));

        System.out.println("Lista de produtos com desconto:");

        for (Produto produto : produtos) {
            double desconto = produto.calcularDesconto();
            double valorFinal = produto.getPreco() - desconto;

            System.out.printf(
                "Produto: %s | Preco: R$ %.2f | Desconto: R$ %.2f | Valor com desconto: R$ %.2f%n",
                produto.getNome(),
                produto.getPreco(),
                desconto,
                valorFinal
            );
        }
    }
}
