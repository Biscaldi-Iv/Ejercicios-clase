package ejercicios_5;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Interfaz {

	public static void main(String[] args) {
		int i;
		String[] clases= {"Vendedor","Administrativo"};
		Empleado[] empleados=new Empleado[2];
		int opt;
		Scanner s=new Scanner(System.in);
		
		for (i=0;i<2;i++) {
			opt=JOptionPane.showOptionDialog(null,"Ocupacion del empleado", "clase",0, 3, null, clases, clases);
			if(opt==0) {
				empleados[i]=new Vendedor();
			}
			else {
				empleados[i]=new Administrativo();
			}
			System.out.print("Ingresar apellido:");
			empleados[i].setApellido(s.next());
			
		
			System.out.println("Ingresar nombre:");
			empleados[i].setNombre(s.next());
			
			System.out.println("Ingresar DNI:");
			empleados[i].setDni((Integer.parseInt(s.next())));
			
			System.out.println("Ingresar Email:");
			empleados[i].setEmail(s.next());
			
			System.out.println("Ingrsar Sueldo Basico:");
			empleados[i].setSueldoBase(Float.valueOf(s.next()));
			
			if(opt==0) {
				System.out.println("Ingresar Total Ventas:");
				((Vendedor)empleados[i]).setTotalVtas(Float.valueOf(s.next()));
				System.out.println("Inesar % comision:");
				((Vendedor)empleados[i]).setPorcenComision(Float.valueOf(s.next()));
			}
			else {
				System.out.println("Ingresar Horas mes:");
				((Administrativo)empleados[i]).setHsMes(Float.valueOf(s.next()));
				System.out.println("Ingresar Horas extra:");
				((Administrativo)empleados[i]).setHsExtra(Float.valueOf(s.next()));
				}
		}
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
