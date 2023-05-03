package org.bedu.java.backend.sesion6.sesion6Postwork.controllers;

import org.bedu.java.backend.sesion6.sesion6Postwork.models.Persona;
import org.bedu.java.backend.sesion6.sesion6Postwork.services.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Set;

@Controller
//@RequestMapping("/api/v1/agenda")
public class AgendaController {
    private final AgendaService agendaService;

    @Autowired
    public AgendaController(AgendaService agendaService) {
        this.agendaService = agendaService;
    }

    @GetMapping({"/", "/index"})
    public String formularioRegistro(Model model) {
        model.addAttribute("persona", new Persona());
        model.addAttribute("listaPersonas", agendaService.getPersonas());

        return "index";
    }

    @PostMapping("/registro")
    public ModelAndView registra(@Valid Persona persona, Errors errors) {

        agendaService.guardaPersona(persona);

        ModelAndView mav = new ModelAndView("index");
        //mav.addObject("listaPersonas", agendaService.getPersonas());
        mav.addObject("registro", true);
        return mav;
    }
    @GetMapping("/lista")
    public ModelAndView obtenerContactos() {
        ModelAndView mav = new ModelAndView("listaContactos");
        mav.addObject("listaPersonas", agendaService.getPersonas());
        return mav;
    }
}
