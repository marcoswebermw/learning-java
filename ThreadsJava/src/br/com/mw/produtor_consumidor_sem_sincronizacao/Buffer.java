package br.com.mw.produtor_consumidor_sem_sincronizacao;

// Buffer servir� para armezanar valores compartilhados entre as threads.
public interface Buffer {

	// Ser� usada pela classe produtora.
	public void set(int valor) throws InterruptedException;
	
	// Ser� usada pela classe consumidora.
	public int get() throws InterruptedException;
}
