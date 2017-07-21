package concurrency;

import java.util.concurrent.ConcurrentHashMap;

public class ProdutorConsumidorTest {
	
	public static void main(String[] args) {
		
		ConcurrentHashMap<String, String> recurso = new ConcurrentHashMap<>();
		
		Produtor p1 = new Produtor(recurso, "Log Asterix");
		Consumidor c1 = new Consumidor(recurso, "Disponiveis");
		Consumidor c2 = new Consumidor(recurso, "Indisponiveis");

		
		p1.start();
		c1.start();
		c2.start();

		
	}

}
