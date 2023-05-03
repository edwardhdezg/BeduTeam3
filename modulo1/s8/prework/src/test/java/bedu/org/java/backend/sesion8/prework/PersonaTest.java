package bedu.org.java.backend.sesion8.prework;

import bedu.org.java.backend.sesion8.prework.model.Persona;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    @Test
    void setNombre() {
        Persona persona = new Persona();
        persona.setNombre("John Doe");
        assertEquals("John Doe", persona.getNombre());
    }

    @Test
    void setTelefono() {
        Persona persona = new Persona();
        persona.setTelefono("1234-5678");
        assertEquals("1234-5678", persona.getTelefono());
    }

    @Test
    void resetInput() {
        Persona persona = new Persona();
        persona.setNombre("John Doe");
        persona.setTelefono("1234-5678");
        persona.resetInput();
        assertEquals("", persona.getNombre());
        assertEquals("", persona.getTelefono());
    }

    @Test
    public void testCompareTo() {
        Persona persona1 = new Persona();
        persona1.setNombre("Juan");

        Persona persona2 = new Persona();
        persona2.setNombre("Pedro");

        Persona persona3 = new Persona();
        persona3.setNombre("Juan");

        assertTrue(persona1.compareTo(persona2) < 0);
        assertTrue(persona2.compareTo(persona1) > 0);
        assertTrue(persona1.compareTo(persona3) == 0);
    }
}






