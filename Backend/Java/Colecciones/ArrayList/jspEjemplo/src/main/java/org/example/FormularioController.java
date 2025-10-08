package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormularioController {

    @GetMapping("/")
    public String mostrarFormulario() {
        return "formulario";
    }

    @PostMapping("/resultado")
    public String procesarFormulario(@RequestParam("nombre") String nombre, Model model){
        model.addAttribute("nombre", nombre);
        return "resultado";
    }
}

