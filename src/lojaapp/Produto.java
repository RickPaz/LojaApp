
package lojaapp;

public class Produto {
    private int codigo;
    private double valor;

    public Produto(int codigo, double valor) {
        this.codigo = codigo;
        this.valor = valor;
    }
    public double obterValorComDesconto(double percentual){
        double desconto;
        desconto = valor*percentual;
        return valor - desconto;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
