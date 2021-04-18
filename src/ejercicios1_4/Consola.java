package ejercicios1_4;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Consola {

	public static void main(String[] args) {
		if (JOptionPane.showConfirmDialog(null,"Ejercicio 1")==JOptionPane.YES_OPTION) {
			primer_ej();
		}
		if (JOptionPane.showConfirmDialog(null, "Ejercicio 2")==JOptionPane.YES_OPTION) {
			segundo_ej();
		}
		if (JOptionPane.showConfirmDialog(null, "Ejercicio 3")==JOptionPane.YES_OPTION) {
			tercer_ej();
		}
		if (JOptionPane.showConfirmDialog(null, "Ejercicio 4")==JOptionPane.YES_OPTION) {
			cuarto_ej();
		}
		
		
	}
	
	public static void primer_ej() {
		int i,j;

		// Mostrar por consola los 10 primeros números enteros y los 10 primeros números impares
		System.out.println("Ejercicio 1\n");
		for (j=0;j<10;j++) {
			System.out.println((j+1)+"° numero entero:"+j);	
		}
		System.out.println("\n");
		for (i=1,j=0;j<10;i+=2,j++) {
			System.out.println((j+1)+"° numero impar:"+i);	
		}
	}
	
	public static void segundo_ej() {
		String[] cad=new String[10];
		int i;
		
		//Leer 10 palabras y mostrarlas en orden inverso al que fueron ingresadas.
		Scanner s=new Scanner(System.in);
		
		System.out.println("\n\tSegundo ejercicio:");
		
		for (i=0;i<10;i++) {
			System.out.print("Ingresar palabra:");
			cad[i]=s.next();
		}
		System.out.println("\tCadenas en orden inverso");
		for(i=9;i>=0;i--) {
			System.out.println(cad[i]);
		}
	}
	
	public static void tercer_ej(){
		int i;
		String[] cads=new String[10];
		
		//Leer 10 palabras, luego leer una nueva palabra e indicar si la misma ya había sido 
		//ingresada en las 10 primeras.
		Scanner s=new Scanner(System.in);
		
		System.out.println("\n\tTercer ejercicio:");
		
		for (i=0;i<10;i++) {
			System.out.print("Ingresar palabra:");
			cads[i]=s.next();
		}
		
		String cade=new String();
		System.out.print("Ingresar busqueda:");
		cade=s.next();
		
		for (i=0;i<10;i++) {
			if(cads[i].contentEquals(cade)) {
				JOptionPane.showMessageDialog(null, "Palabra ya ingresada!");
				break;
			}
		}	
		
	}
	
	public static void cuarto_ej(){
		//Leer un entero y luego una lista de 20 enteros. Guardar los mayores al 
		//número inicial y mostrarlos al final. Usar arrays, no otras colecciones.
		int i,l,n;
		int[] nums=new int[20];
		Scanner s=new Scanner(System.in);
		
		System.out.print("Ingresar numero:");
		n=Integer.parseInt(s.next());
		
		for (i=0;i<20;i++) {
			System.out.println((i+1)+"-Ingresar num:");
			l=Integer.parseInt(s.next());
			if(l>n) {
				nums[i]=l;
			}
		}
		for (i=0;i<20;i++) {
			System.out.print("-"+nums[i]);
		}
		
	}

}
