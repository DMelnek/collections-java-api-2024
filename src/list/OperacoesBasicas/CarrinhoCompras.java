package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    //Atributos
    private List<Item> itemList;

    public CarrinhoCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            System.out.println("A lista está vazia");
        }
        return valorTotal;
    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista está vazia");
        }
    }

    public String toString() {
        return "CarrinhoCompras{" +
                "itens=" + itemList +
                '}';

    }

    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoCompras CarrinhoCompras = new CarrinhoCompras();

        // Adicionando itens ao carrinho
        CarrinhoCompras.adicionarItem("Lápis", 2d, 3);
        CarrinhoCompras.adicionarItem("Lápis", 2d, 3);
        CarrinhoCompras.adicionarItem("Caderno", 35d, 1);
        CarrinhoCompras.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        CarrinhoCompras.exibirItens();

        // Removendo um item do carrinho
        CarrinhoCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        CarrinhoCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + CarrinhoCompras.calcularValorTotal());

    }
}

