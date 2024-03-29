package bedu.backend.java.modulo2.tools;

import bedu.backend.java.modulo2.model.Curso;
import bedu.backend.java.modulo2.model.Estudiante;
import bedu.backend.java.modulo2.model.Materia;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import static org.assertj.core.api.Assertions.assertThat;


class ReporteCalificacionesTest {

    private static final Materia MATERIA = new Materia();
    private static final Estudiante ESTUDIANTE_1 = new Estudiante();
    private static final Estudiante ESTUDIANTE_2 = new Estudiante();
    private static final Estudiante ESTUDIANTE_3 = new Estudiante();
    private static final Curso CURSO = new Curso();

    private static ReporteCalificaciones.Reporte reporte1;
    private static ReporteCalificaciones.Reporte reporte2;
    private static ReporteCalificaciones.Reporte reporte3;

    static{
        MATERIA.setNombre("Matemáticas");

        ESTUDIANTE_1.setNombreCompleto("ccc");
        ESTUDIANTE_2.setNombreCompleto("bbb");
        ESTUDIANTE_3.setNombreCompleto("aaa");

        CURSO.setCiclo("2030");
        CURSO.setMateria(MATERIA);

        Map<Estudiante, Integer> calificaciones = new HashMap<>();
        calificaciones.put(ESTUDIANTE_1, 8);
        calificaciones.put(ESTUDIANTE_2, 5);
        calificaciones.put(ESTUDIANTE_3, 10);

        CURSO.setCalificaciones(calificaciones);

        reporte1 = new ReporteCalificaciones.Reporte("ccc", 8);
        reporte2 = new ReporteCalificaciones.Reporte("bbb", 5);
        reporte3 = new ReporteCalificaciones.Reporte("aaa", 10);


    }

    @Test
    @DisplayName("Ordena alfabéticamente")
    void alfabetico(){
        ReporteCalificaciones reporteCalificaciones = new ReporteCalificaciones();

        assertThat(reporteCalificaciones.alfabetico(CURSO)).containsExactly(reporte3, reporte2, reporte1);
    }


    @Test
    @DisplayName("Ordena por calificaciones")
    void calificaciones(){
        ReporteCalificaciones reporteCalificaciones = new ReporteCalificaciones();

        assertThat(reporteCalificaciones.calificacion(CURSO)).containsExactly(reporte3, reporte1, reporte2);
    }

}
