public class Main {
    public static void main(String[] args) {
        Documento doc = new Documento();

        String estadoRascunho = doc.publicar();

        System.out.println(estadoRascunho);

        String estadoRevisao = doc.publicar();

        System.out.println(estadoRevisao);

        String estadoPublicado = doc.publicar();

        System.out.println(estadoPublicado);
    }    
}
