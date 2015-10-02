package state;
/**
 * Tema: Curso Java
 * Proyecto: EJ_State
 * Autor: Harlem m. Cortes
 *
 */
public class Pendiente implements EstadoAlumno{

	@Override
	public void consultar(Alumno alumno) {
		System.out.println("El Alumno "+alumno.getNombre() +" "+ alumno.getApellido() +" pendiente de aprobacion.");		
	}

}