package Mercado;

public class Produto {

    private String nome;
    private double valor;
    private String descricao;

    public void Produto(String nome, double valor, String descricao){
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
    }

    public double getValor() {
        return this.valor;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString(){
        return nome + " - " + descricao + "\n"
                + "Preço: " + valor ;
    }

}
