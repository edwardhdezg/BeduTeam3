package bedu.backend.java.modulo2.session7.controller;

import bedu.backend.java.modulo2.session7.entity.Empleado;
import bedu.backend.java.modulo2.session7.repository.EmpleadoRepository;
import bedu.backend.java.modulo2.session7.resource.EmpleadoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class DemoController {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    public DemoController(EmpleadoRepository empleadoRepository){
        this.empleadoRepository=empleadoRepository;
    }

    @GetMapping("/{id}")
    private ResponseEntity getEmpleadoById(@PathVariable String id) {
        return ResponseEntity.ok(this.empleadoRepository.findById(id));
    }

    @GetMapping
    private ResponseEntity<List<Empleado>> getAllEmpleados() {
        return ResponseEntity.ok(this.empleadoRepository.findAll());
    }

    @PostMapping("/update")
    private ResponseEntity<Empleado> updateEmpleado(@RequestBody EmpleadoRequest empleadoRequest) {
        Empleado e=new Empleado();
        e.setNombre(empleadoRequest.getNombre());
        return ResponseEntity.status(200).body(this.empleadoRepository.save(e));
    }
}
