public class main {
    public static void main(String[] args){

        Circulo circulo = new Circulo(23);
        Quadrado quadrado = new Quadrado(8,24);

        System.out.println("Áreas das Figuras: ");
        System.out.println("Área do Circulo: " + circulo.calcularArea());
        System.out.println("Área do Quadrado: " + quadrado.calcularArea());

        System.out.println("//////////////////////////////////////////////////");

   
        double soma = circulo.calcularArea() + quadrado.calcularArea();
    
        System.out.println("Soma de ambas as áreas: " + soma);

    }

}