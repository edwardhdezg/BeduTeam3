package bedu.backend.java.modulo2.session7.resource;

import bedu.backend.java.modulo2.session7.repository.EmpleadoRepository;

public class EmpleadoRequest {
    private String nombre;

    public EmpleadoRequest(){
    }

    public EmpleadoRequest(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
