package bedu.backend.java.modulo2.reactive;

import bedu.backend.java.modulo2.model.Curso;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.stream.Collectors;

@Component
public class CalcularPromedioCursoRx {

    public Mono<Double> calcularPromedio(Curso curso){

        return Flux.fromStream(curso.getCalificaciones().values().parallelStream())
                .collect(Collectors.averagingDouble(i -> (double) i));

    }

}
