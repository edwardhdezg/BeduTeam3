package bedu.backend.java.modulo2.session7.repository;

import bedu.backend.java.modulo2.session7.entity.Empleado;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends MongoRepository<Empleado, String> {

}