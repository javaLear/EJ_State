package state;
/**
 * Tema: Curso Java
 * Proyecto: EJ_State
 * Autor: Harlem m. Cortes
 *
 */
public class Curso {
	private EstadoCurso estado;
	
	public Curso() {
		this.estado = new Abrir();
	}	
	
	public void inscribir(Alumno alumno) {
		this.estado.inscribir(alumno);	
	}

	public void abrir() {
		this.estado = new Abrir();
		
	}

	public void cerrar() {
		this.estado = new Cerrar();
		
	}
	
	public void aprobar(Alumno alumno) {
		if(alumno.getNota() >= 4.5)
			alumno.setEstado(new Aprobado());
		else if(alumno.getNota() > 0)
			alumno.setEstado(new Desaprobado());
	}

}
