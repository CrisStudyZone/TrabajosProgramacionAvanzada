package unlam.edu.ar;

public class Butaca {
	
	private char fila;
	private int columna;
	private boolean estadoOcupado;
	
	public Butaca(char fila, int columna) {
		this.fila= fila;
		this.columna=columna;
		estadoOcupado =false;
	}
	public Butaca() {
		
	}

	public boolean isEstado() {
		return estadoOcupado;
	}

	public void setEstado(boolean estado) {
		this.estadoOcupado = estado;
	}
	public String toString() {
		if(estadoOcupado) {
			return fila + columna + "0";
		}else {
			return fila + columna + "D";
		}
	}


}
