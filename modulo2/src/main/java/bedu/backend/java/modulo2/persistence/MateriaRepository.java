package bedu.backend.java.modulo2.persistence;

import bedu.backend.java.modulo2.model.Materia;
import org.springframework.data.repository.CrudRepository;

public interface MateriaRepository extends CrudRepository<Materia, Long> {
}
