package concurrency;

import java.util.concurrent.ConcurrentHashMap;

public class Produtor extends Thread {

	private ConcurrentHashMap<String, String> recurso;
	private String nome;

	public Produtor(ConcurrentHashMap<String, String> recurso, String nome) {
		this.recurso = recurso;
		this.nome = nome;
	}

	@Override
	public void run() {

		int i = 0;

		while (true) {

			recurso.put(""+i, ""+i);
			//recurso.put(""+i*1000, ""+i*1000);

			
			System.out.println("=>Produtor #"+nome+" put: "+ i);
			System.out.println("=>Produtor #"+nome+" BUFFER: "+ recurso.toString());


			int timeout = 4000;
			try {
				System.out.println("=>Produtor #"+nome+" sleep: "+timeout);
				sleep(timeout);
			} catch (InterruptedException e) {
			}
			i++;
			
		}
	}

}
