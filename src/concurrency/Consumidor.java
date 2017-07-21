package concurrency;

import java.util.concurrent.ConcurrentHashMap;

public class Consumidor extends Thread {

	private ConcurrentHashMap<String, String> recurso;
	private String nome;

	public Consumidor(ConcurrentHashMap<String, String> recurso, String nome) {
		this.recurso = recurso;
		this.nome = nome;
	}

	@Override
	public void run() {

		String value = "0";
		int i = 0;

		while (true) {

			value = recurso.get(""+i); // TODO get(numero)
			recurso.remove(""+i);
			if(value != null) {
				i++;
			}
			System.out.println("Consumidor #"+nome+" get: "+ value);

			int timeout = 6000;
			try {
				System.out.println("Consumidor #"+nome+" sleep: "+timeout);
				sleep(timeout);
			} catch (InterruptedException e) {
			}
		}
	}

}
