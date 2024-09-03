public class ServicosIphone {
    
    private AparelhoTelefonico telefone;
    private NavegadorInternet navegador;
    private ReprodutorMusical reprodutor;
    
    public ServicosIphone () {
        this.telefone = new AparelhoTelefonico();
        this.navegador = new NavegadorInternet();
        this.reprodutor = new ReprodutorMusical();
    }
    
    public void ligar(String numero){
        telefone.ligar(numero);
    }
    
    public void atender(){
        telefone.atender();
    }
    
    public void iniciarCorreioVoz() {
        telefone.iniciarCorreioVoz();
    }

    public void exibirPagina(String url) {
        navegador.exibirPagina(url);
    }

    public void adicionarNovaAba() {
        navegador.adicionarNovaAba();
    }

    public void atualizarPagina() {
        navegador.atualizarPagina();
    }

    public void tocar() {
        reprodutor.tocar();
    }

    public void pausar() {
        reprodutor.pausar();
    }

    public void selecionarMusica() {
        reprodutor.solecionarMusica();
    }

}
