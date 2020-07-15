import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EstoqueTest {

	@Test
	public void VerificarMudancaDeNome() {
		// Dado que eu tenho...
		Estoque est = new Estoque("Notebook", 10, 5);
		// Quando eu fizer...
		est.mudarNome("Computador de Mesa");
		// Então, eu espero que...
		assertTrue(est.getNome().equals("Computador de Mesa"));
	}
	
	@Test
	public void VerificarMudancaDeQtdMinima() {
		// Dado que eu tenho...
		Estoque est = new Estoque("Notebook", 10, 5);
		// Quando eu fizer...
		est.mudarQtdMinima(7);
		// Então, eu espero que...
		assertTrue(est.getQtdMinima() == 7);
	}
	
	@Test
	public void VerificarBaixa() {
		// Dado que eu tenho...
		Estoque est = new Estoque("Notebook", 10, 5);
		// Quando eu fizer...
		est.darBaixa(4);
		// Então, eu espero que...
		assertTrue(est.getQtdAtual() == 10 - 4);
	}
	
	@Test
	public void VerificarReposicao() {
		// Dado que eu tenho...
		Estoque est = new Estoque("Notebook", 10, 5);
		// Quando eu fizer...
		est.repor(5);
		// Então, eu espero que...
		assertTrue(est.getQtdAtual() == 10 + 5);
	}
	
	@Test
	public void VerificarNecessidadeDeReposicao() {
		// Dado que eu tenho...
		Estoque est = new Estoque("Notebook", 1, 5);
		// Quando eu fizer...
		boolean resultado = est.precisaRepor();
		// Então, eu espero que...
		assertTrue(resultado);
	}
	
	@Test
	public void VerificarReposicaoNaoNecessaria() {
		// Dado que eu tenho...
		Estoque est = new Estoque("Notebook", 10, 5);
		// Quando eu fizer...
		boolean resultado = est.precisaRepor();
		// Então, eu espero que...
		assertFalse(resultado);
	}
	
}
