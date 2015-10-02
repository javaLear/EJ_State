package state;
/**
 * Tema: Curso Java
 * Proyecto: EJ_State
 * Autor: Harlem m. Cortes
 *
 */
public class Aprobado implements EstadoAlumno{

	@Override
	public void consultar(Alumno alumno) {
		System.out.println("El Alumno "+alumno.getNombre() +" "+ alumno.getApellido() +" esta aprobado.");		
	}

}