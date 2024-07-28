package Zoologico;

public class Capivaras implements Animal {

    private String nome;
    private String comida;
    private boolean limpo = false;

    public void Capivaras(String nome, String comida) {
        this.nome = nome;
        this.comida = comida;
    }

    @Override
    public String alimentar() {
        return "A capivara " + nome + " foi alimentada com " + comida;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getNome() {
        return this.nome;
    }

    public String getComida() {
        return this.comida;
    }
}


