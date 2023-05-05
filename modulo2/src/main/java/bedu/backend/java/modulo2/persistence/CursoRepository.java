package bedu.backend.java.modulo2.persistence;


import bedu.backend.java.modulo2.model.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoRepository extends CrudRepository<Curso, Long> {
}
