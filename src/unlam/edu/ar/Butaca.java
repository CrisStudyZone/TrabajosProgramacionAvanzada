package unlam.edu.ar;

public class Butaca {
	
	private char fila;
	private int columna;
	private boolean estado=false;
	
	public Butaca(char fila, int columna) {
		this.fila= fila;
		this.columna=columna;
	}
	public Butaca() {
		
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	


}
