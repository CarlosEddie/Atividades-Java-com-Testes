
public class ContaBancaria {
	

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String titular;
    public int numero;
    public String agencia;
    public double saldo;
    public String dataDeAbertura;

    public ContaBancaria(String titular, int numero, String agencia, double saldo,
            String dataDeAbertura) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataDeAbertura = dataDeAbertura;
    }
    
    public void saca(double sacar) {
        this.saldo -= sacar;
    }
    public void deposita(double depositar) {
        this.saldo += depositar;
    }
    public double calculaRendimento() {
        double rendimento =  this.saldo * 0.1;
        this.saldo += rendimento;
        return rendimento;
    }
    public String recuperarDadosParaImpressão() {
        return ("Nome do titular: " + titular + "\nNumero da conta: " + numero
                + "\nAgencia: " + agencia + "\nRendimento: " + 
                this.calculaRendimento() + "\nSaldo: " + 
                saldo + "\nData de abertura: " + 
                dataDeAbertura);
    }
    
    
    
    public double getSaldo() {
		return saldo;
	}
    
}
