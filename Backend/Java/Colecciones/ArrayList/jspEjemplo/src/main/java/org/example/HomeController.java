package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    public int visitaCount=0;

    @GetMapping("/")
    public String home(Model model){
        visitaCount++;
        model.addAttribute("visitas", visitaCount);
        return "home";
    }
}
