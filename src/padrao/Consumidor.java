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

		String valor = "0";

		while (true) {

			valor = recurso.get(numero);

		}
	}

}
