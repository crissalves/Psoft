public class Pessoa extends Adapter {

    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void notificaToque(Evento evento){
        System.out.println(this.nome + " " +evento.getDescricao());
    }

    public void notificaMensagem(Evento evento){
        System.out.println(this.nome + " " +evento.getDescricao());
    }

 
}
