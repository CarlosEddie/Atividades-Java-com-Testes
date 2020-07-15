import java.util.Scanner;

public class Tarefa {
	Scanner teclado = new Scanner(System.in);
	ListaDeTarefa tarefa = new ListaDeTarefa();
	public void NovaTarefa() {
		int c = 0, continuar = 0, dia = 0, mes = 0, ano = 0;
		String desc, data;
		do {
			if (c == 0) {
				System.out.println("Digite a descrição da tarefa: ");
				desc = teclado.nextLine();
				System.out.println("Digite a data da entrega [dia/mes/ano]: ");
				System.out.print("Dia: ");
				dia = teclado.nextInt();
				System.out.print("Mês: ");
				mes = teclado.nextInt();
				System.out.print("Ano: ");
				ano = teclado.nextInt();
				data = (dia + "/" + mes + "/" + ano);
				tarefa.adiciona(desc, data, tarefa.status(dia, mes, ano));
				System.out.println("Deseja continuar?\n[0]Sim\n[1]Não");
				continuar = teclado.nextInt();
				c++;
			} else {
				System.out.println("O que voce deseja fazer?");
				System.out.printf("Adicionar nova tarefa[1]\nRemover uma tarefa[2]\nConsultar uma terfa[3]\nAlterar uma terfa[4]");
				int opcao = teclado.nextInt();
				switch (opcao) {
				case 1: {
					System.out.println("Digite a descrição da tarefa: ");
					desc = teclado.next();
					System.out.println("Digite a data da entrega [dia/mes/ano]: ");
					System.out.print("Dia: ");
					dia = teclado.nextInt();
					System.out.print("Mês: ");
					mes = teclado.nextInt();
					System.out.print("Ano: ");
					ano = teclado.nextInt();
					data = (dia + "/" + mes + "/" + ano);
					tarefa.adiciona(desc, data, tarefa.status(dia, mes, ano));
					System.out.println("Deseja continuar?\n[0]Sim\n[1]Não");
					continuar = teclado.nextInt();
					c++;
					break;
				}
				case 2: {
					System.out.println("Você possui " + c + " tarefas registradas");
					System.out.print("Qual deseja remover? [");
					for(int cont = 0; cont < c; cont++) {
						System.out.print(cont + " ");
					}
					System.out.print("]");
					int escolha = teclado.nextInt();
					tarefa.remover(escolha);
					System.out.println("Deseja continuar?\n[0]Sim\n[1]Não");
					continuar = teclado.nextInt();
					break;
				}
				case 3: {
					System.out.println("Você possui " + c + " tarefas registradas");
					System.out.print("Qual deseja consultar? [");
					for(int cont = 0; cont < c; cont++) {
						System.out.print(cont + " ");
					}
					System.out.print("]");
					int escolha = teclado.nextInt();
					System.out.println(tarefa.consultar(escolha));
					System.out.println("Deseja continuar?\n[0]Sim\n[1]Não");
					continuar = teclado.nextInt();
					break;
				}
				case 4: {
					System.out.println("Você possui " + c + " tarefas registradas");
					System.out.print("Qual deseja alterar? [");
					for(int cont = 0; cont < c; cont++) {
						System.out.print(cont + " ");
					}
					System.out.print("]");
					int escolha = teclado.nextInt();
					System.out.println("Digite a nova descrição da tarefa: ");
					desc = teclado.next();
					System.out.println("Digite a nova data da entrega [dia/mes/ano]: ");
					System.out.print("Dia: ");
					dia = teclado.nextInt();
					System.out.print("Mês: ");
					mes = teclado.nextInt();
					System.out.print("Ano: ");
					ano = teclado.nextInt();
					data = (dia + "/" + mes + "/" + ano);
					tarefa.alterar(escolha, desc, data, tarefa.status(dia, mes, ano));
					System.out.println("Tarefa alterada com sucesso");
					System.out.println("Deseja continuar?\n[0]Sim\n[1]Não");
					continuar = teclado.nextInt();
					break;
				}
				default:
					System.out.println("Opção invalida");
				}
			}
		} while(continuar == 0);
		
	}
}
