package org.bedu.java.backend.sesion5.service;


import org.springframework.stereotype.Service;

import javax.validation.constraints.Pattern;


@Service
public class ValidadorTelefono {


    public String limpiaNumero(String telefono) {
        return telefono.replaceAll("[^0-9]", "");
    }
}

