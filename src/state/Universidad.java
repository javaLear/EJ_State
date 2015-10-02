package state;
/**
 * Tema: Curso Java
 * Proyecto: EJ_State
 * Autor: Harlem m. Cortes
 *
 */
import java.util.LinkedList;

public class Universidad {

	private Curso curso;
	
	public Universidad() {
		this.curso = new Curso();
	}
	
	public void inscribir(Alumno alumno){
		System.out.println(alumno.getNombre() + " " + alumno.getApellido() + " ingresando solicitud");
		this.curso.inscribir(alumno);
	}
	
	public void abrirCurso(){
		this.curso.abrir();
	}
	
	public void cerrarCurso(){
		this.curso.cerrar();
	}
	
	public void listarAlumnos(LinkedList<Alumno> alumnos){
		for (Alumno alumno : alumnos) {
			alumno.getEstado().consultar(alumno);
			System.out.println("");
		}
	}
	
	public void finalizarCurso(LinkedList<Alumno> alumnos){
		for (Alumno alumno : alumnos) {
			this.curso.aprobar(alumno);
		}
	}
}

