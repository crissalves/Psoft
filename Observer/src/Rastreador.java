public class Rastreador extends Adapter {

    private String nome;
    private String rastreador;

    public Rastreador(String nome, String rastreador) {
        this.nome = nome;
        this.rastreador = rastreador;
    }

    public void notificaToque(Evento evento){
        System.out.println(this.nome + " " + evento.getDescricao());
    }


}

