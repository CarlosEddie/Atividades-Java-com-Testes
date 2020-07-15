import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Test;

public class QuadradoTest {

	@Test
	public void VerificarArea() {
		// Dado que eu tenho...
		Random num = new Random();
		double lado = num.nextDouble() * 10;
		Quadrado quad = new Quadrado(lado);
		// Quando eu fizer...
		double resultado = quad.area();
		// Então, eu espero que...
		assertTrue(resultado == lado * lado);
	}
	
	@Test
	public void VerificarPerimetro() {
		// Dado que eu tenho...
		Random num = new Random();
		double lado = num.nextDouble() * 10;
		Quadrado quad = new Quadrado(lado);
		// Quando eu fizer...
		double resultado = quad.perimetro();
		// Então, eu espero que...
		assertTrue(resultado == 4 * lado);
	}

}
