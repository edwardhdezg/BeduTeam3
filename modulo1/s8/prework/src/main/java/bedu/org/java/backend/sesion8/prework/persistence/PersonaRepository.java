package bedu.org.java.backend.sesion8.prework.persistence;

import bedu.org.java.backend.sesion8.prework.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
