package padrao;

public class Recurso {
	
	private String conteudo;
	
	private boolean disponivel;
	
	public Recurso() {
		conteudo = "";
	}

	public synchronized String get(int qual) {
		
//		while(this.disponivel == false) {
//			
//			try {
//				//Aguarda o produtor colocar um valor
//				wait();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		this.disponivel = false;
//		notifyAll();
		
		System.out.println("Consumidor #"+qual+" get: "+ conteudo);
		return this.conteudo;
	}
	
	public synchronized void put(int qual, int value) {
		
//		while(this.disponivel == true) {
//			try {
//				//Aguarda o consumidor remover o valor
//				wait();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		System.out.println("Produtor   #"+qual+" put: "+ value);
		this.conteudo += value;
//		this.disponivel=true;
//		notifyAll();
		
	}
	
//	public synchronized void put(int qual, int value) {
//		
//		while(this.disponivel == true) {
//			try {
//				//Aguarda o consumidor remover o valor
//				wait();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		System.out.println("Produtor   #"+qual+" put: "+ value);
//		this.conteudo = value;
//		this.disponivel=true;
//		notifyAll();
//		
//	}

}
