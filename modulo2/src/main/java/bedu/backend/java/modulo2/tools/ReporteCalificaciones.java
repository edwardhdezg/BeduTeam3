package bedu.backend.java.modulo2.tools;

import bedu.backend.java.modulo2.model.Curso;
import bedu.backend.java.modulo2.model.Estudiante;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Comparator;

public class ReporteCalificaciones {

    public static class Reporte {
        private final String nombreEstudiante;
        private final int calificacion;

        public Reporte(String nombreEstudiante, int calificacion) {
            this.nombreEstudiante = nombreEstudiante;
            this.calificacion = calificacion;
        }

        public String getNombreEstudiante() {
            return nombreEstudiante;
        }

        public int getCalificacion() {
            return calificacion;
        }
    }

    public List<Reporte> alfabetico(Curso curso) {
        List<Reporte> reportes = new ArrayList<>();

        for (Map.Entry<Estudiante, Integer> entry : curso.getCalificaciones().entrySet()) {
            Estudiante estudiante = entry.getKey();
            Integer calificacion = entry.getValue();
            reportes.add(new Reporte(estudiante.getNombreCompleto(), calificacion));
        }

        Collections.sort(reportes, Comparator.comparing(Reporte::getNombreEstudiante));

        return reportes;
    }

    public List<Reporte> calificacion(Curso curso) {
        List<Reporte> reportes = new ArrayList<>();

        for (Map.Entry<Estudiante, Integer> entry : curso.getCalificaciones().entrySet()) {
            Estudiante estudiante = entry.getKey();
            Integer calificacion = entry.getValue();
            reportes.add(new Reporte(estudiante.getNombreCompleto(), calificacion));
        }

        Collections.sort(reportes, Comparator.comparing(Reporte::getCalificacion).reversed());

        return reportes;
    }
}
