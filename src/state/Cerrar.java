package state;
/**
 * Tema: Curso Java
 * Proyecto: EJ_State
 * Autor: Harlem m. Cortes
 *
 */
public class Cerrar implements EstadoCurso{

	@Override
	public void inscribir(Alumno alumno) {
		System.out.println("Muy tarde, el curso cerrado!!");
		alumno.setEstado(new Ausente());
		alumno.setNota(-1);
	}

}