public class Rascunho implements Estado {

    private Documento doc;
    private String saida = "Rascunho";

    public Rascunho (Documento doc){
        this.doc = doc;
    }
    
    @Override
    public String publicar() {
        Estado e = new Revisao(this.doc);
        this.doc.setEstado(e);
        return saida;
    }
    
}
