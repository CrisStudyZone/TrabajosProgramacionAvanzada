package unlam.edu.ar;

import java.util.Iterator;

public class Sala {

	private Butaca sala[][];
	private int ticket;
	private int ingresoActual;
	private final int CANTIDAD_DE_COLUMNAS;
	private final int CANTIDAD_DE_FILAS;
	
	public Sala(String nombreDeLaSala, int cantidadDeColumnas, int cantidadDeFilas) {
		this.CANTIDAD_DE_COLUMNAS = cantidadDeColumnas;
		this.CANTIDAD_DE_FILAS = cantidadDeFilas;
		for (int i = 0; i < CANTIDAD_DE_FILAS; i++) {
			for (int j = 0; j < CANTIDAD_DE_COLUMNAS; j++) {
				char fila = (char) ('A' + i);
				int columna = j+1;
				Butaca nueva = new Butaca (fila,columna);
				this.sala [i][j]= nueva;
			}
		}this.ticket=0;
	}
	public void imprimirSala() {
		System.out.println("\nSala de Cine");
		for(int i = 0; i < sala.length; i++) {
			for (int j = 0; j < sala.length; j++) {
				System.out.print(sala[j] + "D");
			}
			System.out.println("\n");
		}
	}
	
}
//	public Sala(int fila, int butaca) {
//		this.fila = (char)fila;
//		this.butaca = butaca;
//		this.sala = new String[fila+1][butaca+1];
//		this.ticket = 0;
//	}
//	
//	
//	
//}
