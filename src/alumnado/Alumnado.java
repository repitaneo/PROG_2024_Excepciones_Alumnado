package alumnado;

import excepciones.AlturaMinimaException;
import excepciones.EdadMinimaException;
import excepciones.PesoMinimoException;

/**
 * @author Marcos
 * Alumnado es un bean que pretende crear
 * 
 */
public class Alumnado {

	private String nombre;
	private int edad;
	private int altura;
	private int peso;
	
	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @return
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * 
	 * @return
	 */
	public int getAltura() {
		return altura;
	}
	public int getPeso() {
		return peso;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(int edad) throws EdadMinimaException {
		if(edad<12) {
			throw new EdadMinimaException("La edad minima es 12");
		}
		this.edad = edad;
	}
	public void setAltura(int altura) throws AlturaMinimaException {
		if(altura<100) {
			throw new AlturaMinimaException("La altura minima es 100");
		}		
		this.altura = altura;
	}
	public void setPeso(int peso) throws PesoMinimoException {
		if(peso<20) {
			throw new PesoMinimoException("El peso minimo es 20");
		}		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return "Alumnado [nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + "]";
	}

	
	
}
