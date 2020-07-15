
public class Estoque {
	
	public String nome;
    public int qtdAtual;
    public int qtdMinima;

    public Estoque() {
        
    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        if(qtdAtual < 0 || qtdMinima < 0) {
            this.nome = nome;
            this.qtdAtual = 0;
            this.qtdMinima = 0;
        } else {
            this.nome = nome;
            this.qtdAtual = qtdAtual;
            this.qtdMinima = qtdMinima;
        }
    }
    
    public void mudarNome(String nome) {
        this.nome = nome;
    }
    public void mudarQtdMinima(int qtdminima) {
        this.qtdMinima = qtdminima;
    }
    public void repor(int qtd) {
        this.qtdAtual += qtd;
    }
    public void darBaixa(int qtd) {
        this.qtdAtual -= qtd;
    }
    public String mostra() {
        return ("Nome do produto: " + this.nome + 
                "\nQuantidade minima: " + this.qtdMinima +
                "\nQuantidade atual: " + this.qtdAtual);
    }
    public boolean precisaRepor() {
        return this.qtdAtual <= this.qtdMinima;
    }
    
    
    
    public String getNome() {
		return nome;
	}

	public int getQtdAtual() {
		return qtdAtual;
	}

	public int getQtdMinima() {
		return qtdMinima;
	}

}
