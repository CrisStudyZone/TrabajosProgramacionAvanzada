package unlam.edu.ar;

public class Sala {

	private Butaca sala[][];
	private String nombre;
	private final int CANTIDAD_DE_COLUMNAS;
	private final int CANTIDAD_DE_FILAS;
	private Butaca libre[] = null;

	public Sala(String nombreDeLaSala, int cantidadDeColumnas, int cantidadDeFilas) {
		this.nombre = nombreDeLaSala;
		this.CANTIDAD_DE_COLUMNAS = cantidadDeColumnas;
		this.CANTIDAD_DE_FILAS = cantidadDeFilas;
		sala = new Butaca[CANTIDAD_DE_FILAS][CANTIDAD_DE_COLUMNAS];
		for (int i = 0; i < CANTIDAD_DE_FILAS; i++) {
			for (int j = 0; j < CANTIDAD_DE_COLUMNAS; j++) {
				char fila = (char) ('A' + i);
				int columna = j + 1;
				Butaca nueva = new Butaca(fila, columna);
				sala[i][j] = nueva;
			}
		}
	}

	public void imprimirSala() {
		System.out.println("\nSala de Cine");
		if (sala != null) {
			for (int i = 0; i < sala.length; i++) {
				for (int j = 0; j < sala[i].length; j++) {
					System.out.print(sala[i][j] + "-");
				}
				System.out.println();
			}
		}
	}

	public boolean butacaOcupada(char fila, int columna) {
		fila = (char) fila;
		if (sala[fila][columna].isEstado() != false) {
			return true;
		}
		return false;
	}

	public void ocuparButaca(char fila, int columna) {
		fila = (char) fila;
		if (sala[fila][columna].isEstado() != true) {
			sala[fila][columna].setEstado(true);
		} else {
			System.out.println("La butaca esta ocupada");
		}
	}

	public int cantidadDeButacasOcupadas() {
		int contador = 0;
			for (int i = 0; i < sala.length; i++) {
				for (int j = 0; j < sala.length; j++) {
					if (butacaOcupada((char) i, j) != true) {
						contador++;
					}
				}
			}
		return contador;
	}
	
	public boolean hayEspacioPara(int cantidadDePersonas) {
		int contador = 0;
		if (contador == cantidadDePersonas) {
			for (int k = 0; k < sala.length; k++) {
				for (int j = 0; j < sala.length; j++) {
					if (butacaOcupada((char) k, j) != true && butacaOcupada((char) k, j + 1) != true) {
						contador++;
						libre[j] = sala[k][j];
					}else {
						contador = 0;
					}
				}
			}
			return true;
		}
		return false;
	}
}
