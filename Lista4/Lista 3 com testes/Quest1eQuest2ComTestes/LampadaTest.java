import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LampadaTest {
	
	@Test
	public void ConferirSeLigou() {
		// Dado que eu tenho...
		Lampada lamp = new Lampada();
		// Quando eu fizer...
		lamp.liga();
		String resultado = lamp.observa();
		// Então, eu espero que...
		assertTrue(resultado.contentEquals("Ligada"));
	}
	
	@Test
	public void ConferirSeDesligou() {
		// Dado que eu tenho...
		Lampada lamp = new Lampada();
		// Quando eu fizer...
		lamp.desliga();
		String resultado = lamp.observa();
		// Então, eu espero que...
		assertTrue(resultado.contentEquals("Desligada"));
	}
}
