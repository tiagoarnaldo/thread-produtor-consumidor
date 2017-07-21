package padrao;

public class Produtor extends Thread {

	private Recurso recurso;
	private int numero;

	public Produtor(Recurso recurso, int numero) {
		this.recurso = recurso;
		this.numero = numero;
	}

	@Override
	public void run() {

		int i = 0;

		while (true) {

			recurso.put(numero, ""+i);

			try {
				sleep(1000);
			} catch (InterruptedException e) {
			}
			i++;
			
		}
	}

}
