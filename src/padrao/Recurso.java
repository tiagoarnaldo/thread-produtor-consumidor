package padrao;

public class Recurso {
	
	private String conteudo;
	
	private boolean disponivel;
	
	public Recurso() {
		conteudo = "";
	}

	public synchronized String get(int qual) {
		
		while(this.disponivel == false) {
			
			try {
				//Aguarda o produtor colocar um valor
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.disponivel = false;
		notifyAll();
		
		System.out.println("Consumidor " + qual + " get: " + conteudo);
		
		return this.conteudo;
	}
	
	
	public synchronized void put(int qual, String valor) {
		
		while(this.disponivel == true) {
			try {
				//Aguarda o consumidor remover o valor
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		this.conteudo = valor;
		this.disponivel=true;
		notifyAll();
		
		System.out.println("=====> Produtor   #"+qual+" put: "+ valor);
		
	}

}
