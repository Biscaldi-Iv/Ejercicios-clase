package ejercios_5_B;
import java.util.Scanner;

import javax.swing.JOptionPane;
import java.util.LinkedList;
import ejercicios_5.Administrativo;
import ejercicios_5.Vendedor;
import ejercicios_5.Empleado;

public class LinkedList_5 {
	public static void ejer_5()
	 {
		String[] clases= {"Vendedor","Administrativo"};
		
		LinkedList<Empleado> empleados=new LinkedList<>();
		
		int opt;
		
		Scanner s=new Scanner(System.in);
		
		do {
			Empleado empleado=new Empleado();
			opt=JOptionPane.showOptionDialog(null,"Ocupacion del empleado", "clase",0, 3, null, clases, clases);
			if(opt==0) {
				empleado=new Vendedor();
			}
			else {
				empleado=new Administrativo();
			}
			System.out.print("Ingresar apellido:");
			empleado.setApellido(s.next());
			
		
			System.out.println("Ingresar nombre:");
			empleado.setNombre(s.next());
			
			System.out.println("Ingresar DNI:");
			empleado.setDni((Integer.parseInt(s.next())));
			
			System.out.println("Ingresar Email:");
			empleado.setEmail(s.next());
			
			System.out.println("Ingrsar Sueldo Basico:");
			empleado.setSueldoBase(Float.valueOf(s.next()));
			
			if(opt==0) {
				System.out.println("Ingresar Total Ventas:");
				((Vendedor)empleado).setTotalVtas(Float.valueOf(s.next()));
				System.out.println("Inesar % comision:");
				((Vendedor)empleado).setPorcenComision(Float.valueOf(s.next()));
			}
			else {
				System.out.println("Ingresar Horas mes:");
				((Administrativo)empleado).setHsMes(Float.valueOf(s.next()));
				System.out.println("Ingresar Horas extra:");
				((Administrativo)empleado).setHsExtra(Float.valueOf(s.next()));
				}
			empleados.add(empleado);

		} while(JOptionPane.showConfirmDialog(null,"Agregar mas empleados?")==JOptionPane.YES_OPTION);
		
		System.out.println("DNI\tApellido\tNombre\tEmail\tSueldo\n");
		
		for (Empleado empleado:empleados) {
			
			System.out.print(empleado.getDni()+"\t"+empleado.getApellido()
			+"\t"+empleado.getNombre()+"\t"+empleado.getEmail()+"\t");
			
			if(empleado instanceof Vendedor) {
				System.out.println(((Vendedor)empleado).getSueldo());
			}
			else {
				System.out.println(((Administrativo)empleado).getSueldo());
			}
		}
		
		s.close();

	}

}
