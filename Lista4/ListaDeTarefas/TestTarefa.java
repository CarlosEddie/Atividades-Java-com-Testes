import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestTarefa {
	@Test
	public void Adicionar() {
		// Dado que ...
		ListaDeTarefa tarefa = new ListaDeTarefa();
		// Quando eu ...
		boolean resultado = tarefa.adiciona("Tarefa adicionada", "22/06/2020", tarefa.status(22, 06, 2020));
		// Eu espero ...
		assertTrue(resultado);
	}
	@Test
	public void Remover() {
		// Dado que ...
		ListaDeTarefa tarefa = new ListaDeTarefa();
		tarefa.adiciona("Tarefa adicionada", "22/06/2020", tarefa.status(22, 06, 2020));
		// Quando eu ...
		boolean resultado = tarefa.remover(0);
		// Eu espero ...
		assertTrue(resultado);
	}
	@Test
	public void Consultar() {
		// Dado que ...
		ListaDeTarefa tarefa = new ListaDeTarefa();
		tarefa.adiciona("Tarefa adicionada", "22/06/2020", tarefa.status(22, 06, 2020));
		// Quando eu ...
		String resultado = tarefa.consultar(0);
		System.out.println(tarefa.consultar(0));
		// Eu espero ...
		assertTrue(resultado.equals(tarefa.tarefa[0]));
	}
	@Test 
	public void Alterar() {
		// Dado que ...
		ListaDeTarefa tarefa = new ListaDeTarefa();
		tarefa.adiciona("Tarefa adicionada", "22/06/2020", tarefa.status(22, 06, 2020));
		// Quando eu ...
		boolean resultado = tarefa.alterar(0, "Alterado", "21/05/2020", tarefa.status(21, 05, 2020));
		// Eu espero ...
		assertTrue(resultado);
	}

}
