
public class Quadrado {
	
	public double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    public double area() {
        double area = this.lado * this.lado;
        return (area);
    }
    public double perimetro() {
        double perimetro = 4 * this.lado;
        return (perimetro);
    }
    
}
