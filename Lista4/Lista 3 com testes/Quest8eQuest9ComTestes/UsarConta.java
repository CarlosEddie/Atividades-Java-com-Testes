
public class UsarConta {
	
	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria("Carlos", 12345, "Banco", 7000.0, "07/08/2005");
        //Altera��o de dados da conta
        c1.saca(300);
        c1.deposita(1500);
        c1.saca(200);
        //Recupera��o de dados da conta com o rendimento
        System.out.println(c1.recuperarDadosParaImpress�o());
        
        //Nova altera��o de dados da conta
        c1.saca(1000);
        c1.deposita(700);
        //Recupera��o de dados da conta com o rendimento
        System.out.println(c1.recuperarDadosParaImpress�o());
	}
	
}
