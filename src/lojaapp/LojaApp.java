
package lojaapp;

public class LojaApp {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Fulano","12345678911");
        CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras(cliente1);
        Produto p1 = new Produto(1, 10.0);
        carrinho1.adicionarProduto(p1, 2, 0.5);
        Produto p2 = new Produto(2, 5.0);
        carrinho1.adicionarProduto(p2, 1, 0.0);
        Produto p3 = new Produto(4, 20.0);
        carrinho1.adicionarProduto(p3, 1, 0.5);
        
        System.out.println("Itens do carrinho: " + carrinho1.toString());;
        System.out.println("Valor total: " + carrinho1.obterValorTotal());
    }
    
}
