public class Quadrado implements FiguraGeometrica{

    private int comprimento;
    private int altura;

    public Quadrado(int comprimento, int altura){
        this.comprimento = comprimento;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return this.altura * this.comprimento;
    }


}
