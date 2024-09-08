public class Main {
    public static void main(String[] args) {
        Telefone telefone = new Telefone();

        Interessado pessoa = new Pessoa("João");
        Interessado correio = new Correio("Correio Central", "123ABC");
        Interessado rastreador = new Rastreador("TIM", "2408SCD");

        telefone.addInteressado(pessoa);
        telefone.addInteressado(correio);
        telefone.addInteressado(rastreador);

        telefone.tocar(); // Notifica João e Rastreador pelo toque

        System.out.println("///////////////////////////////////////////////////////////");

        telefone.mensagem(); // Notifica João e o Correio pela mensagem


    }
}

