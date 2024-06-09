package co.edu.cue.practicaSpring_.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/hello")
    public String test(Model model){
        model.addAttribute("message", "Hola, Mundo");
        return "hello";
    }

    @GetMapping("/hola")
    public String test2(Model model){
        model.addAttribute("message", "Hola, Mundo 2");
        return "hola";
    }
}
