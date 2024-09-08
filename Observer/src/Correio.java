public class Correio extends Adapter {

    private String nome;
    private String rastreador;

    public Correio(String nome, String rastreador) {
        this.nome = nome;
        this.rastreador = rastreador;
    }

    public void notificaMensagem(Evento evento){
        System.out.println(this.nome + " " + evento.getDescricao());
    }

}
