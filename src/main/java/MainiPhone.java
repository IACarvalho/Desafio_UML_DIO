public class MainiPhone {
    public static void main(String[] args) {
        Navegador navegador = new Navegador();
        navegador.exibirPagina("google.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

        ReprodutorMusical reprodutor = new ReprodutorMusical();
        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica("Stairway to Heaven");

        AparelhoTelefonico telefone = new AparelhoTelefonico();
        telefone.ligar("123456789");
        telefone.atender();
        telefone.iniciarCorreio();
    }
}
