
public class Lampada {
	public boolean ligada;

    public Lampada() {
        this.ligada = false;
    }
    
    public void liga() {
        this.ligada = true;
    }
    public void desliga() {
        this.ligada = false;
    }
    public String observa() {
        if(this.ligada == true) {
            return "Ligada";
        } else {
            return "Desligada";
        }
    }
}
