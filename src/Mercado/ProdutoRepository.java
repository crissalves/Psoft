package Mercado;

import java.util.ArrayList;

public class ProdutoRepository {
    ArrayList<Produto> produtos = new ArrayList<Produto>();

    public void add(Produto produto) {
        produtos.add(produto);
    }

    public Produto getProduto(int index){
        return produtos.get(index);
    }

    public int getProdutoIndex(Produto produto){
        return produtos.indexOf(produto);
    }

    public void deleteProduto(int index){
        produtos.remove(index);
    }

    public void deleteProduto(Produto produto){
        produtos.remove(produto);
    }

}
