package ejercios_5_B;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class IArrayList_4 
{
	public static void cuarto_ej()
	{
		//Leer un entero y luego una lista de 20 enteros. Guardar los mayores al 
		//número inicial y mostrarlos al final. Usar arrays, no otras colecciones.
		int i,l,n;
		ArrayList<Integer> nums=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		
		System.out.print("Ingresar numero:");
		n=Integer.parseInt(s.next());
		
		for (i=0;i<20;i++) {
			System.out.println((i+1)+"-Ingresar num:");
			l=Integer.parseInt(s.next());
			nums.add(l);
		}
		Collections.sort(nums);
		System.out.print("Numeros: "+nums);
	}
		
}
