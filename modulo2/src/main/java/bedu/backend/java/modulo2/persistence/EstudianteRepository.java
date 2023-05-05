package bedu.backend.java.modulo2.persistence;

import bedu.backend.java.modulo2.model.Estudiante;
import org.springframework.data.repository.CrudRepository;

public interface EstudianteRepository extends CrudRepository<Estudiante, Long> {
}