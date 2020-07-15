import java.util.Calendar;

public class ListaDeTarefa {
	
	String[] tarefa = new String[10];
	int c = 0;

	public boolean adiciona(String desc, String data, String status) {
		this.tarefa[c] = "Descrição: " + desc + "\nData: " + data + "\nStatus:" + status;
		c++;
		if(tarefa[c-1].equals("Descrição: " + desc + "\nData: " + data + "\nStatus:" + status)) {
			return true;
		} else {
			return false;
		}
	}


	public boolean remover(int i) {
		this.tarefa[i] = "Tarefa removida pelo usuario";
		if(tarefa[i] == "Tarefa removida pelo usuario") {
			return true;
		} else {
			return false;
		}
		
	}


	public String consultar(int i) {
		return tarefa[i];
	}


	public boolean alterar(int i, String desc, String data, String status) {
		tarefa[i] = "Descrição: " + desc + "\nData: " + data + "\nStatus:" + status;
		if(tarefa[i].equals("Descrição: " + desc + "\nData: " + data + "\nStatus:" + status)) {
			return true;
		} else {
			return false;
		}
	}
	
	public String status(int d, int m, int a) {
		Calendar c = Calendar.getInstance();
		int dia = c.get(Calendar.DAY_OF_MONTH);
		int mes = c.get(Calendar.MONTH) + 1;
		int ano = c.get(Calendar.YEAR);
		
		if((a >= ano) && (m >= mes) && (d >= dia)) {
			return "Tarefa ainda na data de entrega";
		} else {
			return "Tarefa ja passou da data de entrega";
		}
	}
	
}
