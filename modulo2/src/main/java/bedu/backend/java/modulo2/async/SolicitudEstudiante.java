package bedu.backend.java.modulo2.async;

import bedu.backend.java.modulo2.model.Curso;
import bedu.backend.java.modulo2.model.Estudiante;

public class SolicitudEstudiante {
    private Estudiante estudiante;
    private Curso curso;

    public SolicitudEstudiante(Estudiante estudiante, Curso curso) {
        this.estudiante = estudiante;
        this.curso = curso;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
