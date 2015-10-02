package state;

/**
 * Tema: Curso Java
 * Proyecto: EJ_State
 * Autor: Harlem m. Cortes
 *
 */
public class Abrir implements EstadoCurso{

	@Override
	public void inscribir(Alumno alumno) {
		System.out.println("Inscribiendo a: "+alumno.getNombre() +" "+ alumno.getApellido());	
		alumno.setEstado(new Pendiente());
	}

}