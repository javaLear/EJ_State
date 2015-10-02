package state;
/**
 * Tema: Curso Java
 * Proyecto: EJ_State
 * Autor: Harlem m. Cortes
 *
 */
import java.util.LinkedList;

public class Sistema {

	public static void main(String[] args) {
		
		LinkedList<Alumno> alumnos = new LinkedList<Alumno>();
		alumnos.add(new Alumno("Ana", "Ruiz", 3.5));
		alumnos.add(new Alumno("Pedro", "Cortes", 4.7));
		alumnos.add(new Alumno("Juana", "Diaz", 8.0));
		alumnos.add(new Alumno("Manuel", "Nuñez", 6.2));
		alumnos.add(new Alumno("Julian", "Serna", 2.5));
		alumnos.add(new Alumno("Paula", "Correa", 5.0));
		alumnos.add(new Alumno("Jose", "Mina", 4.0));
		
		
		Universidad universidad= new Universidad();
		universidad.inscribir(alumnos.get(0));
		System.out.println("");		
		universidad.inscribir(alumnos.get(1));
		System.out.println("");	
		universidad.inscribir(alumnos.get(2));
		System.out.println("");	
		universidad.inscribir(alumnos.get(3));
		System.out.println("");	
		universidad.inscribir(alumnos.get(4));
		System.out.println("");	
		universidad.cerrarCurso();
		universidad.inscribir(alumnos.get(5));
		System.out.println("");	
		universidad.inscribir(alumnos.get(6));
		System.out.println("");	
		universidad.listarAlumnos(alumnos);
		universidad.finalizarCurso(alumnos);
		System.out.println("Fin del Curso");
		universidad.listarAlumnos(alumnos);

	}

}
