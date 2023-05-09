package listaDupla;

public class Celula {
	Celula Proxima;
	Celula Anterior;
	Object Elemento;

	public Celula(Object elemento) {
		this.Proxima = null;
		this.Anterior = null;
		this.Elemento = elemento;
	}

	public Celula(Celula proxima, Object elemento) {
		this.Proxima = proxima;
		this.Anterior = null;
		this.Elemento = elemento;
	}

	public void setProxima(Celula proxima) {
		this.Proxima = proxima;
	}

	public Celula getProxima() {
		return (this.Proxima);
	}

	public Celula getAnterior() {
		return (this.Anterior);
	}

	public void setAnterior(Celula anterior) {
		this.Anterior = anterior;
	}

	public Object getElemento() {
		return (this.Elemento);
	}
}
