public class Revisao implements Estado {

    private Documento doc;
    private String saida = "Revisao";
    
    public Revisao (Documento doc){
        this.doc = doc;
    }
    
    @Override
    public String publicar() {
        Estado e = new Publicado(this.doc);
        this.doc.setEstado(e);
        return saida;
    }
    
}
