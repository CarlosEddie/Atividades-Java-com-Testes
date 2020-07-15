import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ContaBancariaTest {

	@Test
	public void VerificarSaque() {
		// Dado que eu tenho...
		ContaBancaria conta = new ContaBancaria("Carlos", 1247, "Banco", 1000, "01/02/2003");
		// Quando eu fizer...
		conta.saca(200);
		// Então, eu espero que...
		assertTrue(conta.getSaldo() == 1000 - 200);
	}
	
	@Test
	public void VerificarDeposito() {
		// Dado que eu tenho...
		ContaBancaria conta = new ContaBancaria("Carlos", 1247, "Banco", 1000, "01/02/2003");
		// Quando eu fizer...
		conta.deposita(200);
		// Então, eu espero que...
		assertTrue(conta.getSaldo() == 1000 + 200);
	}
	
	@Test
	public void VerificarRendimento() {
		// Dado que eu tenho...
		ContaBancaria conta = new ContaBancaria("Carlos", 1247, "Banco", 1000, "01/02/2003");
		// Quando eu fizer...
		conta.calculaRendimento();
		// Então, eu espero que...
		assertTrue(conta.getSaldo() == 1000 + (0.1 * 1000));
	}
	
}
