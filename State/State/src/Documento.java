public class Documento {
    
    private Estado estado;

    public Documento(){
        Estado estado = new Rascunho(this);
        this.estado = estado;
    }

    public String publicar(){
        return estado.publicar();
    }

    public void setEstado(Estado estado){
        this.estado = estado;
    }

}
