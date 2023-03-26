package bedu.org.java.backend.sesion8.prework.controller;
import bedu.org.java.backend.sesion8.prework.model.Persona;
import bedu.org.java.backend.sesion8.prework.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
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
        if(!errors.hasErrors()) {
            agendaService.guardaPersona(persona);
        }
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("listaPersonas", agendaService.getPersonas());
        return mav;
    }

    @GetMapping("/lista")
    public ModelAndView obtenerContactos() {
        ModelAndView mav = new ModelAndView("listaContactos");
        mav.addObject("listaPersonas", agendaService.getPersonas());
        return mav;
    }

}
