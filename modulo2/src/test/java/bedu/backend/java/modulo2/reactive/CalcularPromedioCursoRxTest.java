package bedu.backend.java.modulo2.reactive;

import bedu.backend.java.modulo2.model.Curso;
import bedu.backend.java.modulo2.model.Estudiante;
import bedu.backend.java.modulo2.model.Materia;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.within;

class CalcularPromedioCursoRxTest {

    private static final Curso CURSO = new Curso();

    static {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombreCompleto("Estudiante Uno");

        Estudiante estudiante2 = new Estudiante();
        estudiante2.setNombreCompleto("Estudiante Dos");

        Estudiante estudiante3 = new Estudiante();
        estudiante3.setNombreCompleto("Estudiante Tres");

        Materia materia = new Materia();
        materia.setNombre("Materia");

        CURSO.setCiclo("2030");
        CURSO.setMateria(materia);

        Map<Estudiante, Integer> calificaciones = new HashMap<>();
        calificaciones.put(estudiante1, 5);
        calificaciones.put(estudiante2, 8);
        calificaciones.put(estudiante3, 10);

        CURSO.setCalificaciones(calificaciones);
    }

    @Test
    @DisplayName("Postwork 5")
    void calculaPromedio(){
        CalcularPromedioCursoRx sut = new CalcularPromedioCursoRx();

        sut.calcularPromedio(CURSO)
                .subscribe(v -> assertThat(v).isEqualTo(7.66, within(0.1)));

    }
}
