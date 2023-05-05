package bedu.backend.java.modulo2.session7.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.security.PublicKey;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Empleado {
    @Id
    private String id;
    private String nombre;

    public Empleado(){
    }

    public Empleado(String nombre){
        this.nombre=nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
