package main;

import java.util.Scanner;

import alumnado.Alumnado;
import excepciones.AlturaMinimaException;
import excepciones.EdadMinimaException;
import excepciones.PesoMinimoException;

public class Start3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int peso, edad,altura, veces = 0;
		String nombre;
		do {
			
			System.out.print("\nEscribe tu nombre ");
			nombre = sc.nextLine();
			System.out.print("Escribe la edad ");
			edad = sc.nextInt();
			System.out.print("Escribe el peso ");
			peso = sc.nextInt();
			System.out.print("Escribe la altura ");
			altura = sc.nextInt();

			
			Alumnado a = new Alumnado();
			a.setNombre(nombre);
			try {
				a.setEdad(edad);
				a.setPeso(peso);
				a.setAltura(altura);
				System.out.println(a);
				veces++;
			}
			catch(EdadMinimaException e) {}				
			catch(PesoMinimoException e) {}				
			catch(AlturaMinimaException e) {}			
			catch(Exception e) {}
			
			
			
			nombre = sc.nextLine();
			
			
		} while (veces < 4);

	}

}
