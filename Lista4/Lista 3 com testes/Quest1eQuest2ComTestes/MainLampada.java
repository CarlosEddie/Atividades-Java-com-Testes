
public class MainLampada {
	
	public static void main(String[] args) {
		//Instaciando objetos do tipo lampada
        Lampada lampa1 = new Lampada();
        Lampada lampa2 = new Lampada();
        
        //Ligadando objeto lampa1 e desligando lampa 2
        lampa1.liga();
        lampa2.desliga();
        
        /*Mostrando se os objetos lampa1 e lampa2 estão 
        "ligados" ou "desligados"*/
        System.out.println(lampa1.observa());
        System.out.println(lampa2.observa());
	}
	
}
