package padrao;

public class Consumidor extends Thread {

	private Recurso recurso;
	private int numero;

	public Consumidor(Recurso recurso, int numero) {
		this.recurso = recurso;
		this.numero = numero;
	}

	@Override
	public void run() {

		String value = "0";
		int i = 0;

		while (true) {

			value = recurso.get(numero); // TODO get(numero)
			try {
				sleep(5000);
			} catch (InterruptedException e) {
			}
			i++;
		}
	}

}
