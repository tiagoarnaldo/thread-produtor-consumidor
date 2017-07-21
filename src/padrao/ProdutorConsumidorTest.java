package padrao;

public class ProdutorConsumidorTest {
	
	public static void main(String[] args) {
		
		Recurso recurso = new Recurso();
		Produtor p1 = new Produtor(recurso, 1);
		Consumidor c1 = new Consumidor(recurso, 1);
		Consumidor c2 = new Consumidor(recurso, 2);

		
		p1.start();
		c1.start();
		c2.start();

		
	}

}
