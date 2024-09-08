import java.util.ArrayList;
import java.util.List;

public class Telefone {
    
    private List<Interessado> interessados;

    public Telefone() {
        this.interessados = new ArrayList<>();
    }

    public void tocar(){
        Evento evento = new Evento("TOQUE", "RING RING RING");
        notificaToque(evento);
    }

    public void mensagem(){
        Evento evento = new Evento("MENSAGEM", "OLHA A MENSAGEM URIIII");
        notificaMensagem(evento);
    }

    //Adiciona e remove são obrigadorios para esse padrão.
    public void addInteressado(Interessado interessado){
        this.interessados.add(interessado);
    }

    public void removeInteressado(Interessado interessado){
        this.interessados.remove(interessado);
    }

    private void notificaToque(Evento evento){
        for (Interessado interessado : interessados) {
            interessado.notificaToque(evento);
        }
    }
    
    private void notificaMensagem(Evento evento){
        for (Interessado interessado : interessados) {
            interessado.notificaMensagem(evento);
        }
    }
}
