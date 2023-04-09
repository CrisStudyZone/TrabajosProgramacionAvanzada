package unlam.edu.ar;

public class Main {

	public static void main(String[] args) {
		Sala sala1 = new Sala ("Sala 1", 10,14);
		Butaca libre = new Butaca();
		
		sala1.imprimirSala();
		
		public boolean hayEspacioPara(Integer cantidadDePersonas) {
			
			for(int i = 0; i<=cantidadDePersonas; i++) {
				if(i == cantidadDePersonas) {
				for(int j=0; j<sala1.length; j++) {
					if(sala1 [i].getEstado() == false && sala1 [i+1].getEstado() == false) {
					libre[i]=sala1[i];
					}
					}
				}return true;
			}
			return false;
		}
		
		
	}

	/*
	 * 1. Crearla con la cantidad de butacas totales y cantidad de filas.
	 * 2. Consultar si la sala está vacía. 
	 * 3. Consultar si una butaca está ocupada(referida por fila y asiento). 
	 * 4. Ocupar una butaca determinada, siempre que
	 * ésta no esté previamente ocupada. 5. Consultar la cantidad total de butacas
	 * ocupadas. 6. Consultar si es posible acomodar a un grupo de X personas, en
	 * forma contigua, en la misma fila:
	 * 
	 * Boolean hayEspacioPara(Integer cantidadDePersonas)
	 */

}
