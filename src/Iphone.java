public class Iphone {
    public static void main(String[] args) throws Exception {
        
        
        ServicosIphone iphone = new ServicosIphone();
        
        
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        
        
        
        iphone.exibirPagina("dio.me");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        
        
        
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        
        
        
    }
}
