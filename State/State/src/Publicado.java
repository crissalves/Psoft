public class Publicado implements Estado {

    private Documento doc;
    private String saida = "Publicado com Sucesso";

    public Publicado (Documento doc){
        this.doc = doc;
    }

    @Override
    public String publicar() {
        return saida;
    }
    
}
