
public class UsaEstoque {
	
	public static void main(String[] args) {
		Estoque estoque1 = new Estoque("Impressora Jato de Tinta", 13, 6);
        Estoque estoque2 = new Estoque("Monitor LCD 17 polegadas", 11, 13);
        Estoque estoque3 = new Estoque("Mouse Ótico", 6, 2);
        
        //Dando baixa no estoque1
        estoque1.darBaixa(5);
        //Repondo o estoque2
        estoque2.repor(7);
        //Dando baixa no estoque3
        estoque3.darBaixa(4);
        
        //Conferindo se é necessario repor algum dos 3 obejetos
        System.out.println(estoque1.precisaRepor());
        System.out.println(estoque2.precisaRepor());
        System.out.println(estoque3.precisaRepor());
        
        //Mostranda as informações dos 3 objetos
        System.out.println(estoque1.mostra());
        System.out.println(estoque2.mostra());
        System.out.println(estoque3.mostra());
	}
	
}
