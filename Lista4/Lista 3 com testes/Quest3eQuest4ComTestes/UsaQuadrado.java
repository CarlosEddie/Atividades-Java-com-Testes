
public class UsaQuadrado {
	
	public static void main(String[] args) {
		Quadrado q1 = new Quadrado(2);
        Quadrado q2 = new Quadrado(4);
        Quadrado q3 = new Quadrado(5);
        
        // Mostrando a area e o perimetro de q1
        System.out.println(q1.area());
        System.out.println(q1.perimetro());
        
        // Mostrando a area e o perimetro de q2
        System.out.println(q2.area());
        System.out.println(q2.perimetro());
        
        // Mostrando a area e o perimetro de q3
        System.out.println(q3.area());
        System.out.println(q3.perimetro());
	}
	
}
